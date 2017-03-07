package com.example.czz.stockknower.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.bean.CollectionInfo;

import java.util.ArrayList;

/**
 * Created by czz on 2017/3/5.
 */

public class CollectAdapter extends BaseAdapter {
    private ArrayList<CollectionInfo> list = new ArrayList<>();
    private LayoutInflater inflater;

    public CollectAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public ArrayList<CollectionInfo> getList() {
        return list;
    }

    public void setList(ArrayList<CollectionInfo> list) {
        this.list = list;
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
            convertView = inflater.inflate(R.layout.item_coll,null);
            vh = new ViewHolder();
            vh.tv_stockname = (TextView) convertView.findViewById(R.id.tv_col_stockName);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.tv_stockname.setText(list.get(position).getStockName());
        return convertView;
    }
    class ViewHolder{
        TextView tv_stockname;
    }
}
