package com.example.czz.stockknower.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.czz.stockknower.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by czz on 2017/3/4.
 */

public class GridAdapter extends BaseAdapter {
    private ArrayList<Integer> list = new ArrayList<>();
    private LayoutInflater inflater;

    public GridAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
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
            convertView = inflater.inflate(R.layout.grit_item,null);
            vh = new ViewHolder();
            vh.roundImg = (RoundedImageView) convertView.findViewById(R.id.grid_item_roundimg);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.roundImg.setImageResource(list.get(position));
        return convertView;
    }

    class ViewHolder{
        RoundedImageView roundImg;
    }
}
