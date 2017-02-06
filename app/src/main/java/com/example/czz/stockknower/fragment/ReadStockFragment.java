package com.example.czz.stockknower.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.czz.stockknower.R;
import com.example.czz.stockknower.View.StockOfMarket;
import com.example.czz.stockknower.activity.DetailStockActivity;
import com.example.czz.stockknower.adapter.StockAdapter;
import com.example.czz.stockknower.bean.AmericaStock;
import com.example.czz.stockknower.bean.HongKongStock;
import com.example.czz.stockknower.bean.Market;
import com.example.czz.stockknower.bean.Stock;
import com.example.czz.stockknower.utils.PullToRefreshBase;
import com.example.czz.stockknower.utils.PullToRefreshScrollView;
import com.google.gson.Gson;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.wangjie.shadowviewhelper.ShadowProperty;
import com.wangjie.shadowviewhelper.ShadowViewHelper;

import java.io.Serializable;
import java.util.List;


public class ReadStockFragment extends Fragment implements AdapterView.OnItemClickListener,PullToRefreshBase.OnRefreshListener2{
    private View readStockView;
    private StockOfMarket lv_stock;
    private StockAdapter adapter;
    private TextView tv_marketName,tv_marketDealNum,tv_dealPri,tv_highPri,tv_lowPri,tv_increPer,
            tv_increase,tv_openPri,tv_yesPri,tv_nowPri,tv_time;
    private PullToRefreshScrollView scrollView;
    private RequestQueue queue;
    private RelativeLayout market_layout;
    private int position;
    private List list;
    private int currentIndex=1;
    //上海股市列表
    private final String shangHaiList = "http://web.juhe.cn:8080/finance/stock/shall?key=727b1a6c826ae31340205b53ef704af3";
    //上海股市大盘
    private final String shangHaiMarket = "http://web.juhe.cn:8080/finance/stock/hs?type=0&key=727b1a6c826ae31340205b53ef704af3";
    //深圳股市列表
    private final String shenZhenList = "http://web.juhe.cn:8080/finance/stock/szall?key=727b1a6c826ae31340205b53ef704af3";
    //深圳股市大盘
    private final String shenZhenMarket = "http://web.juhe.cn:8080/finance/stock/hs?type=1&key=727b1a6c826ae31340205b53ef704af3";
    //香港股市列表
    private final String hongKongList = "http://web.juhe.cn:8080/finance/stock/hkall?key=727b1a6c826ae31340205b53ef704af3";
    //美国股市列表
    private final String americaList = "http://web.juhe.cn:8080/finance/stock/usaall?key=727b1a6c826ae31340205b53ef704af3";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        readStockView = inflater.inflate(R.layout.fragment_read_stock, null);
        position = FragmentPagerItem.getPosition(getArguments());
        queue = Volley.newRequestQueue(getActivity());
        initRefresh();
        addShadow();
        initListView();
        market_layout = (RelativeLayout) readStockView.findViewById(R.id.market_layout);
        initData();

        return readStockView;
    }
    //根据判断获取不同数据
    private void initData() {
        if (position==0){//上海股市
            initCardView(shangHaiMarket);
            initListData(shangHaiList);
        }else if (position==1){//深圳股市
            initCardView(shenZhenMarket);
            initListData(shenZhenList);
        }else if (position==2){//香港股市
            market_layout.setVisibility(View.GONE);
            initListData(hongKongList);
        }else if (position==3){//美国股市
            market_layout.setVisibility(View.GONE);
            initListData(americaList);
        }
    }
    //初始化刷新
    private void initRefresh() {
        scrollView = (PullToRefreshScrollView) readStockView.findViewById(R.id.sv_view);
        scrollView.setMode(PullToRefreshBase.Mode.BOTH);
        scrollView.setOnRefreshListener(this);

    }
    //初始化大盘以及获取大盘数据
    private void initCardView(String url) {
        tv_marketName = (TextView) readStockView.findViewById(R.id.tv_marketName);
        tv_marketDealNum = (TextView) readStockView.findViewById(R.id.tv_marketDealNum);
        tv_dealPri = (TextView) readStockView.findViewById(R.id.tv_dealPri);
        tv_highPri = (TextView) readStockView.findViewById(R.id.tv_highPri);
        tv_lowPri = (TextView) readStockView.findViewById(R.id.tv_lowPri);
        tv_increPer = (TextView) readStockView.findViewById(R.id.tv_increPer);
        tv_increase = (TextView) readStockView.findViewById(R.id.increase);
        tv_openPri = (TextView) readStockView.findViewById(R.id.openPri);
        tv_yesPri = (TextView) readStockView.findViewById(R.id.yesPri);
        tv_nowPri = (TextView) readStockView.findViewById(R.id.nowPri);
        tv_time = (TextView) readStockView.findViewById(R.id.tv_time);

        lv_stock.setFocusable(false);


        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Market market = gson.fromJson(response, Market.class);
                Market.ResultBean result = market.getResult();
                tv_marketName.setText(result.getName());
                tv_marketDealNum.setText(result.getDealNum());
                tv_dealPri.setText(result.getDealPri());
                tv_highPri.setText(result.getHighPri());
                tv_lowPri.setText(result.getLowpri());
                tv_increPer.setText(result.getIncrePer());
                tv_increase.setText(result.getIncrease());
                tv_openPri.setText(result.getOpenPri());
                tv_yesPri.setText(result.getYesPri());
                tv_nowPri.setText(result.getNowpri());
                tv_time.setText(result.getTime());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(),error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(request);
        queue.start();

    }
    //获取listView数据
    private void initListData(String url) {

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                decodeData(response);
                adapter.setList(list);
                adapter.notifyDataSetChanged();
                currentIndex = 1;
                if (scrollView.isRefreshing()){
                    scrollView.onRefreshComplete();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(),"请求数据失败",Toast.LENGTH_SHORT).show();

            }
        });
        queue.add(request);
        queue.start();
    }
    //解析数据
    private void decodeData(String response) {
        Gson gson = new Gson();
        if (position==0 || position==1){
            Stock stock = gson.fromJson(response, Stock.class);
            list = stock.getResult().getData();
        }else if (position==2){
            HongKongStock hongKongStock = gson.fromJson(response,HongKongStock.class);
            list = hongKongStock.getResult().getData();
        }else if (position==3){
            AmericaStock americaStock = gson.fromJson(response,AmericaStock.class);
            list = americaStock.getResult().getData();
        }
    }
    //初始化listView
    private void initListView() {
        lv_stock = (StockOfMarket) readStockView.findViewById(R.id.lv_stockOfMarket);
        adapter = new StockAdapter(getActivity(),position);
        lv_stock.setAdapter(adapter);
        lv_stock.setOnItemClickListener(this);

    }
    //添加阴影效果
    private void addShadow() {
        ShadowViewHelper.bindShadowHelper(new ShadowProperty().setShadowColor(0x77000000)
                .setShadowDy(3)
                .setShadowDx(3)
                .setShadowRadius(3),readStockView.findViewById(R.id.market_layout));
    }

    //item点击事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), DetailStockActivity.class);
        intent.putExtra("stock", (Serializable) adapter.getList().get(position));
        intent.putExtra("position",this.position);
        startActivity(intent);
    }

    //下拉
    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        initData();
    }

    //上拉
    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        currentIndex += 1;
        String currentUrl = null;
        if (position==0){
            currentUrl = "http://web.juhe.cn:8080/finance/stock/shall?page="+currentIndex+"&key=727b1a6c826ae31340205b53ef704af3";
        }else if (position==1){
            currentUrl = "http://web.juhe.cn:8080/finance/stock/szall?page="+currentIndex+"&key=727b1a6c826ae31340205b53ef704af3";
        }else if (position==2){
            currentUrl = "http://web.juhe.cn:8080/finance/stock/hkall?page="+currentIndex+"&key=727b1a6c826ae31340205b53ef704af3";
        }else if (position==3){
            currentUrl = "http://web.juhe.cn:8080/finance/stock/usaall?page="+currentIndex+"&key=727b1a6c826ae31340205b53ef704af3";
        }
        StringRequest request = new StringRequest(currentUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                decodeData(response);
                adapter.addToFooter(list);
                adapter.notifyDataSetChanged();
                scrollView.onRefreshComplete();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(),error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(request);
        queue.start();
    }
}
