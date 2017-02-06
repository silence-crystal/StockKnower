package com.example.czz.stockknower.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.bean.AmericaStock;
import com.example.czz.stockknower.bean.HongKongStock;
import com.example.czz.stockknower.bean.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czz on 2017/1/13.
 */

public class StockAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List list;
    private Context context;
    private int index;

    public StockAdapter(Context context,int index) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.index = index;
        if (index==0 || index==1){
            list = new ArrayList<Stock.ResultBean.DataBean>();
        }else if (index==2){
            list = new ArrayList<HongKongStock.ResultBean.DataBean>();
        }else if (index==3){
            list = new ArrayList<AmericaStock.ResultBean.DataBean>();
        }
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list.clear();
        this.list.addAll(list);
    }

    public void addToFooter(List<Object> list){
        this.list.addAll(list);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (convertView==null){
            convertView = inflater.inflate(R.layout.item_stock,null);
            vh = new ViewHolder();
            vh.tv_stockName = (TextView) convertView.findViewById(R.id.tv_stockName);
            vh.tv_stockPri = (TextView) convertView.findViewById(R.id.tv_stockPri);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        if (list==null || list.size()==0){
            vh.tv_stockName.setText("暂无数据请稍候。。。");
            vh.tv_stockPri.setText("...");
        }else {
            if (index == 0 || index == 1) {
                Stock.ResultBean.DataBean bigLandStock = (Stock.ResultBean.DataBean) list.get(position);
                vh.tv_stockName.setText(bigLandStock.getName());
                String changePercent = bigLandStock.getChangepercent();
                double changePer = Double.parseDouble(changePercent);
                if (changePer >= 0) {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.red));
                    vh.tv_stockPri.setText("+" + changePercent + "%");
                } else {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.green));
                    vh.tv_stockPri.setText(changePercent + "%");
                }
            } else if (index == 2) {
                HongKongStock.ResultBean.DataBean hongKongStock = (HongKongStock.ResultBean.DataBean) list.get(position);
                vh.tv_stockName.setText(hongKongStock.getName());
                String changePercent = hongKongStock.getChangepercent();
                double changePer = Double.parseDouble(changePercent);
                if (changePer >= 0) {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.red));
                    vh.tv_stockPri.setText("+" + changePercent + "%");
                } else {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.green));
                    vh.tv_stockPri.setText(changePercent + "%");
                }
            } else if (index == 3) {
                AmericaStock.ResultBean.DataBean americaStock = (AmericaStock.ResultBean.DataBean) list.get(position);
                vh.tv_stockName.setText(americaStock.getCname());
                String changePercent = americaStock.getChg();
                double changePer = Double.parseDouble(changePercent);
                if (changePer >= 0) {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.red));
                    vh.tv_stockPri.setText("+" + changePercent + "%");
                } else {
                    vh.tv_stockPri.setTextColor(ContextCompat.getColor(context, R.color.green));
                    vh.tv_stockPri.setText(changePercent + "%");
                }
            }
        }
        return convertView;
    }

    class ViewHolder{
        TextView tv_stockName;
        TextView tv_stockPri;
    }
}
