package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.czz.stockknower.R;
import com.example.czz.stockknower.bean.AmericaStock;
import com.example.czz.stockknower.bean.CollectionInfo;
import com.example.czz.stockknower.bean.HkStockInfo;
import com.example.czz.stockknower.bean.HongKongStock;
import com.example.czz.stockknower.bean.Stock;
import com.example.czz.stockknower.bean.StockInfo;
import com.example.czz.stockknower.bean.UsaStockInfo;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

public class DetailStockActivity extends Activity implements View.OnClickListener{
    private TextView tv_stockNameDetail;//股票名称
    private TextView tv_stockId;//股票编号
    private TextView tv_traNumber;//成交量
    private TextView tv_traAmount;//成交额
    private TextView tv_increaseDetail;//涨跌幅
    private TextView tv_increPerDetail;//涨跌百分比
    private TextView tv_todayStartPri;//今开
    private TextView tv_yestodayEndPri;//昨收
    private TextView tv_inPri;//买入价
    private TextView tv_inPriWord;//买入价
    private TextView tv_outPri;//卖出价
    private TextView tv_outPriWord;//卖出价
    private TextView tv_todayMax;//最高
    private TextView tv_todayMin;//最低
    private TextView tv_nowPri;//当前价格
    private TextView tv_timeDetail;//时间
    private ImageView iv_stockKimg;//今日k线图
    private TextView tv_collection;
    private ImageView img_share;

    private RequestQueue queue;
    private DisplayImageOptions options;
    private ImageLoader imageLoader;
    private int intentType;
    private String reqID;
    private int position;
    private String stockID;
    private ArrayList<CollectionInfo> collectedList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_stock);

        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.loading)
                .showImageOnFail(R.mipmap.loadfailed)
                .build();

        imageLoader = ImageLoader.getInstance();

        queue = Volley.newRequestQueue(this);

        initView();
        initData();

    }

    private void initData() {
        Intent intent = getIntent();
        position = intent.getIntExtra("position",0);
        Object detailStock = intent.getSerializableExtra("stock");
        stockID = intent.getStringExtra("stockID");
        if (detailStock==null){
            intentType=1;
        }else {
            intentType=2;
        }

        netRequest(detailStock);
    }

    private void netRequest(Object detailStock) {
        if (position==0 || position==1){

            if (intentType==1){
                reqID = stockID;
            }else if (intentType==2){
                Stock.ResultBean.DataBean stock= (Stock.ResultBean.DataBean) detailStock;
                reqID = stock.getSymbol();
            }

            StringRequest stockInfoReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/hs?gid="+reqID+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    StockInfo info = gson.fromJson(response, StockInfo.class);
                    StockInfo.ResultBean.DataBean data = info.getResult().get(0).getData();
                    String imgUrl = info.getResult().get(0).getGopicture().getDayurl();
                    tv_stockNameDetail.setText(data.getName());
                    tv_stockId.setText(data.getGid());
                    tv_traNumber.setText(data.getTraNumber());
                    tv_traAmount.setText(data.getTraAmount());
                    tv_increaseDetail.setText(data.getIncrease());
                    tv_increPerDetail.setText(data.getIncrePer());
                    tv_todayStartPri.setText(data.getTodayStartPri());
                    tv_yestodayEndPri.setText(data.getYestodEndPri());
                    tv_inPri.setText(data.getCompetitivePri());
                    tv_outPri.setText(data.getReservePri());
                    tv_todayMax.setText(data.getTodayMax());
                    tv_todayMin.setText(data.getTodayMin());
                    tv_nowPri.setText(data.getNowPri());
                    tv_timeDetail.setText(data.getDate()+" "+data.getTime());
                    imageLoader.displayImage(imgUrl,iv_stockKimg,options);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(DetailStockActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });

            queue.add(stockInfoReq);
            queue.start();

        }else if (position==2){

            if (intentType==1){
                reqID = stockID;
            }else if (intentType==2){
                HongKongStock.ResultBean.DataBean hkStock = (HongKongStock.ResultBean.DataBean) detailStock;
                reqID = hkStock.getSymbol();
            }

            StringRequest hkStockInfoReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/hk?num="+reqID+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    HkStockInfo hkInfo = gson.fromJson(response, HkStockInfo.class);
                    String imgUrl = hkInfo.getResult().get(0).getGopicture().getDayurl();
                    HkStockInfo.ResultBean.DataBean hkData = hkInfo.getResult().get(0).getData();
                    tv_stockNameDetail.setText(hkData.getName());
                    tv_stockId.setText(hkData.getGid());
                    tv_traNumber.setText(hkData.getTraNumber());
                    tv_traAmount.setText(hkData.getTraAmount());
                    tv_increaseDetail.setText(hkData.getUppic());
                    tv_increPerDetail.setText(hkData.getLimit());
                    tv_todayStartPri.setText(hkData.getOpenpri());
                    tv_yestodayEndPri.setText(hkData.getFormpri());
                    tv_inPri.setText(hkData.getInpic());
                    tv_outPri.setText(hkData.getOutpic());
                    tv_todayMax.setText(hkData.getMaxpri());
                    tv_todayMin.setText(hkData.getMinpri());
                    tv_nowPri.setText(hkData.getLastestpri());
                    tv_timeDetail.setText(hkData.getDate()+" "+hkData.getTime());
                    imageLoader.displayImage(imgUrl,iv_stockKimg,options);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(DetailStockActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });
            queue.add(hkStockInfoReq);
            queue.start();

        }else if (position==3){

            if (intentType==1){
                reqID = stockID;
            }else if (intentType==2){
                AmericaStock.ResultBean.DataBean usaStock = (AmericaStock.ResultBean.DataBean) detailStock;
                reqID = usaStock.getSymbol();
            }

            StringRequest usaStockInfoReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/usa?gid="+reqID+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    UsaStockInfo usaInfo = gson.fromJson(response, UsaStockInfo.class);
                    UsaStockInfo.ResultBean.DataBean usaData = usaInfo.getResult().get(0).getData();
                    String imgUrl = usaInfo.getResult().get(0).getGopicture().getDayurl();
                    tv_stockNameDetail.setText(usaData.getName());
                    tv_stockId.setText(usaData.getGid());
                    tv_traNumber.setText(usaData.getAvgTraNumber());
                    tv_traAmount.setText(Double.parseDouble(usaData.getAvgTraNumber())*Double.parseDouble(usaData.getLastestpri())+"");
                    tv_increaseDetail.setText(usaData.getUppic());
                    tv_increPerDetail.setText(usaData.getLimit());
                    tv_todayStartPri.setText(usaData.getOpenpri());
                    tv_yestodayEndPri.setText(usaData.getFormpri());
                    tv_inPriWord.setVisibility(View.GONE);
                    tv_inPri.setVisibility(View.GONE);
                    tv_outPriWord.setVisibility(View.GONE);
                    tv_outPri.setVisibility(View.GONE);
                    tv_todayMax.setText(usaData.getMaxpri());
                    tv_todayMin.setText(usaData.getMinpri());
                    tv_nowPri.setText(usaData.getLastestpri());
                    tv_timeDetail.setText(usaData.getUstime());
                    imageLoader.displayImage(imgUrl,iv_stockKimg,options);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(DetailStockActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });
            queue.add(usaStockInfoReq);
            queue.start();
        }
    }

    private void initView() {
        tv_stockNameDetail = (TextView) findViewById(R.id.tv_stockNameDetail);
        tv_stockId = (TextView) findViewById(R.id.tv_stockId);
        tv_traNumber = (TextView) findViewById(R.id.tv_traNumber);
        tv_traAmount = (TextView) findViewById(R.id.tv_traAmount);
        tv_increaseDetail = (TextView) findViewById(R.id.tv_increaseDetail);
        tv_increPerDetail = (TextView) findViewById(R.id.tv_increPerDetail);
        tv_todayStartPri = (TextView) findViewById(R.id.tv_todayStartPri);
        tv_yestodayEndPri = (TextView) findViewById(R.id.tv_yestodayEndPri);
        tv_inPri = (TextView) findViewById(R.id.tv_inPri);
        tv_inPriWord = (TextView) findViewById(R.id.tv_inPriWord);
        tv_outPri = (TextView) findViewById(R.id.tv_outPri);
        tv_outPriWord = (TextView) findViewById(R.id.tv_outPriWord);
        tv_todayMax = (TextView) findViewById(R.id.tv_todayMax);
        tv_todayMin = (TextView) findViewById(R.id.tv_todayMin);
        tv_nowPri = (TextView) findViewById(R.id.tv_nowPri);
        tv_timeDetail = (TextView) findViewById(R.id.tv_timeDetail);
        iv_stockKimg = (ImageView) findViewById(R.id.iv_stockKimg);
        tv_collection = (TextView) findViewById(R.id.tv_collection);
        img_share = (ImageView) findViewById(R.id.img_share);


        tv_collection.setOnClickListener(this);
        img_share.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_collection:
                final BmobUser user = BmobUser.getCurrentUser();
                if (user==null){
                    Intent intent = new Intent(DetailStockActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else {
                    BmobQuery<CollectionInfo> query = new BmobQuery<>();
                    query.addWhereEqualTo("userID",user.getObjectId());
                    query.setLimit(1000);
                    query.findObjects(new FindListener<CollectionInfo>() {
                        @Override
                        public void done(List<CollectionInfo> list, BmobException e) {
                            if (e==null){
                                collectedList = (ArrayList<CollectionInfo>) list;
                                boolean isCollect = false;
                                for (int i=0;i<collectedList.size();i++){
                                    if (collectedList.get(i).getStockID().equals(tv_stockId.getText().toString())){
                                        isCollect=true;
                                        Toast.makeText(DetailStockActivity.this,"已经收藏过啦",Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (!isCollect){
                                    CollectionInfo info = new CollectionInfo();
                                    info.setType(position+"".trim());
                                    info.setStockID(tv_stockId.getText().toString());
                                    info.setStockName(tv_stockNameDetail.getText().toString());
                                    info.setUserID(user.getObjectId());
                                    info.save(new SaveListener<String>() {
                                        @Override
                                        public void done(String s, BmobException e) {
                                            if (e==null){
                                                Toast.makeText(DetailStockActivity.this,"收藏成功",Toast.LENGTH_SHORT).show();
                                            }else {
                                                Toast.makeText(DetailStockActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });
                                }
                            }else{
                                Toast.makeText(DetailStockActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                break;
            case R.id.img_share:
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss",
                        Locale.US);
                String fname = "/sdcard/" + sdf.format(new Date()) + ".png";
                View view = v.getRootView();
                view.setDrawingCacheEnabled(true);
                view.buildDrawingCache();
                Bitmap bitmap = view.getDrawingCache();
                if (bitmap != null) {
                    System.out.println("bitmapgot!");
                    try {
                        FileOutputStream out = new FileOutputStream(fname);
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                        Uri imageUri = Uri.fromFile(new File(fname));
                        Intent shareIntent = new Intent();
                        shareIntent.setAction(Intent.ACTION_SEND);
                        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                        shareIntent.setType("image/*");
                        startActivity(Intent.createChooser(shareIntent, "分享到"));
                        System.out.println("file" + fname + "所得图片");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("bitmap is NULL!");
                }
                break;
        }
    }
}
