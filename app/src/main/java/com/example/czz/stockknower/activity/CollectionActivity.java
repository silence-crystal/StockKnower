package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.adapter.CollectAdapter;
import com.example.czz.stockknower.bean.CollectionInfo;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class CollectionActivity extends Activity implements AdapterView.OnItemClickListener{
    private ListView listView;
    private ArrayList<CollectionInfo> colList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        listView = (ListView) findViewById(R.id.lv_collect);
        listView.setOnItemClickListener(this);
        initData();
    }

    private void initData() {
        BmobUser user = BmobUser.getCurrentUser();
        if (user==null){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }else {
            BmobQuery<CollectionInfo> query = new BmobQuery<>();
            query.addWhereEqualTo("userID",user.getObjectId());
            query.setLimit(100);
            query.findObjects(new FindListener<CollectionInfo>() {
                @Override
                public void done(List<CollectionInfo> list, BmobException e) {
                    if (e==null){
                        colList = (ArrayList<CollectionInfo>) list;
                        CollectAdapter adapter = new CollectAdapter(CollectionActivity.this);
                        adapter.setList(colList);
                        listView.setAdapter(adapter);
                    }else{
                        Toast.makeText(CollectionActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String startStr = colList.get(position).getStockID();
        if (startStr.startsWith("hk")){
            startStr = startStr.substring(2);
        }
        Intent intent = new Intent(this,DetailStockActivity.class);
        intent.putExtra("stockID",startStr);
        intent.putExtra("position",Integer.parseInt(colList.get(position).getType()));
        startActivity(intent);

    }
}
