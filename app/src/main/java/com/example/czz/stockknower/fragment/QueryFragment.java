package com.example.czz.stockknower.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.content.ContextCompat;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.czz.stockknower.R;
import com.example.czz.stockknower.bean.StockInfo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class QueryFragment extends Fragment implements View.OnClickListener{
    private View mView;
    private EditText et_stockID;
    private ImageView iv_clear,iv_search;
    private RelativeLayout rl_stockType;
    private TextView tv_hsStock,tv_hkStock,tv_usaStock,tv_resStockName,tv_resStockPri;
    private int currentType = 0;
    private List<TextView> tvList;
    private RequestQueue queue;
    private RelativeLayout rl_searchRes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_query, null);

        queue = Volley.newRequestQueue(getActivity());

        initView();
        return mView;
    }

    private void initView() {
        et_stockID = (EditText) mView.findViewById(R.id.et_stockID);
        iv_clear = (ImageView) mView.findViewById(R.id.img_clear);
        iv_search = (ImageView) mView.findViewById(R.id.img_search);
        rl_stockType = (RelativeLayout) mView.findViewById(R.id.rl_selectType);
        rl_searchRes = (RelativeLayout) mView.findViewById(R.id.rl_searchRes);
        tv_hsStock = (TextView) mView.findViewById(R.id.tv_hsStock);
        tv_hkStock = (TextView) mView.findViewById(R.id.tv_hkStock);
        tv_usaStock = (TextView) mView.findViewById(R.id.tv_usaStock);
        tv_resStockName = (TextView) mView.findViewById(R.id.tv_resStockName);
        tv_resStockPri = (TextView) mView.findViewById(R.id.tv_resStockPri);

        iv_clear.setOnClickListener(this);
        iv_search.setOnClickListener(this);
        tv_hsStock.setOnClickListener(this);
        tv_hkStock.setOnClickListener(this);
        tv_usaStock.setOnClickListener(this);

        tvList = new ArrayList<>();
        tvList.add(tv_hsStock);
        tvList.add(tv_hkStock);
        tvList.add(tv_usaStock);

        et_stockID.addTextChangedListener(watcher);

    }
    //Edittext文字改变监听
    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length()!=0){
                iv_clear.setVisibility(View.VISIBLE);
            }else {
                iv_clear.setVisibility(View.GONE);
            }
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_clear:
                et_stockID.setText("");
                break;
            case R.id.img_search:
                search();
                break;
            case R.id.tv_hsStock:
                for (int i=0;i<tvList.size();i++){
                    if (tvList.get(i).getId()== R.id.tv_hsStock){
                        tvList.get(i).setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.stock_type_shape));
                    }else {
                        tvList.get(i).setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.white));
                    }
                }
                currentType=1;
                break;
            case R.id.tv_hkStock:
                for (int i=0;i<tvList.size();i++){
                    if (tvList.get(i).getId()== R.id.tv_hkStock){
                        tvList.get(i).setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.stock_type_shape));
                    }else {
                        tvList.get(i).setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.white));
                    }
                }
                currentType=2;
                break;
            case R.id.tv_usaStock:
                for (int i=0;i<tvList.size();i++){
                    if (tvList.get(i).getId()== R.id.tv_usaStock){
                        tvList.get(i).setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.stock_type_shape));
                    }else {
                        tvList.get(i).setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.white));
                    }
                }
                currentType=3;
                break;
        }
    }
    //查询方法
    private void search() {
        if (currentType==0){
            Toast.makeText(getActivity(),"请先选择您要查询的股市",Toast.LENGTH_SHORT).show();
        }else if (currentType==1){
            if (et_stockID.getText().toString().length()==0){
                Toast.makeText(getActivity(),"请输入要查询的股票ID",Toast.LENGTH_SHORT).show();
            }else {
                StringRequest stockSearchReq = new StringRequest("http://web.juhe.cn:8080/finance/stock/hs?gid="+et_stockID.getText().toString()+"&key=727b1a6c826ae31340205b53ef704af3", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        StockInfo info = gson.fromJson(response, StockInfo.class);
                        String reason = info.getReason();
                        if (reason.equals("error param!")){
                            Toast.makeText(getActivity(),"请输入正确的股票ID",Toast.LENGTH_SHORT).show();
                        }else if (reason.equals("not found!")){
                            Toast.makeText(getActivity(),"没有找到该股票",Toast.LENGTH_SHORT).show();
                        }else if (reason.equals("SUCCESSED!")){
                            String stockName = info.getResult().get(0).getData().getName();
                            String stockID = info.getResult().get(0).getData().getGid();
                            String increPer = info.getResult().get(0).getData().getIncrePer();
                            tv_resStockName.setText(stockName);
                            double per = Double.parseDouble(increPer);
                            if (per>=0){
                                tv_resStockPri.setText("+"+increPer+"%");
                                tv_resStockPri.setTextColor(ContextCompat.getColor(getActivity(),R.color.red));
                            }else {
                                tv_resStockPri.setText("-"+increPer+"%");
                                tv_resStockPri.setTextColor(ContextCompat.getColor(getActivity(),R.color.green));
                            }
                            rl_stockType.setVisibility(View.GONE);
                            rl_searchRes.setVisibility(View.VISIBLE);

                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                queue.add(stockSearchReq);
                queue.start();
            }
        }else if (currentType==2){

        }else if (currentType==3){

        }
    }
}
