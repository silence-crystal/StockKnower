package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
import com.example.czz.stockknower.bean.HkStockInfo;
import com.example.czz.stockknower.bean.HongKongStock;
import com.example.czz.stockknower.bean.Stock;
import com.example.czz.stockknower.bean.StockInfo;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

public class DetailStockActivity extends Activity {
    private TextView tv_stockNameDetail;//股票名称
    private TextView tv_stockId;//股票编号
    private TextView tv_traNumber;//成交量
    private TextView tv_traAmount;//成交额
    private TextView tv_increaseDetail;//涨跌幅
    private TextView tv_increPerDetail;//涨跌百分比
    private TextView tv_todayStartPri;//今开
    private TextView tv_yestodayEndPri;//昨收
    private TextView tv_inPri;//买入价
    private TextView tv_outPri;//卖出价
    private TextView tv_todayMax;//最高
    private TextView tv_todayMin;//最低
    private TextView tv_nowPri;//当前价格
    private TextView tv_timeDetail;//时间
    private ImageView iv_stockKimg;//今日k线图

    private RequestQueue queue;
    private DisplayImageOptions options;
    private ImageLoader imageLoader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_stock);

        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .build();

        imageLoader = ImageLoader.getInstance();

        queue = Volley.newRequestQueue(this);

        initView();
        initData();

    }

    private void initData() {
        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);
        Object detailStock = intent.getSerializableExtra("stock");

        Toast.makeText(this,position+"",Toast.LENGTH_SHORT).show();

        if (position==0 || position==1){
            Stock.ResultBean.DataBean stock= (Stock.ResultBean.DataBean) detailStock;
            tv_stockNameDetail.setText(stock.getName());
            tv_stockId.setText(stock.getSymbol());

            StringRequest stockInfoReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/hs?gid="+stock.getSymbol()+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    StockInfo info = gson.fromJson(response, StockInfo.class);
                    StockInfo.ResultBean.DataBean data = info.getResult().get(0).getData();
                    String imgUrl = info.getResult().get(0).getGopicture().getDayurl();
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
            HongKongStock.ResultBean.DataBean hkStock = (HongKongStock.ResultBean.DataBean) detailStock;

            StringRequest hkStockInfoReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/hk?num="+hkStock.getSymbol()+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    HkStockInfo hkInfo = gson.fromJson(response, HkStockInfo.class);
                    String imgUrl = hkInfo.getResult().get(0).getGopicture().getDayurl();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
            queue.add(hkStockInfoReq);
            queue.start();

        }else if (position==3){
            AmericaStock.ResultBean.DataBean usaStock = (AmericaStock.ResultBean.DataBean) detailStock;
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
        tv_outPri = (TextView) findViewById(R.id.tv_outPri);
        tv_todayMax = (TextView) findViewById(R.id.tv_todayMax);
        tv_todayMin = (TextView) findViewById(R.id.tv_todayMin);
        tv_nowPri = (TextView) findViewById(R.id.tv_nowPri);
        tv_timeDetail = (TextView) findViewById(R.id.tv_timeDetail);
        iv_stockKimg = (ImageView) findViewById(R.id.iv_stockKimg);
    }
}
