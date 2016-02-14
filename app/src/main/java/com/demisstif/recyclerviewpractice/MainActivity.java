package com.demisstif.recyclerviewpractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private MyAdapter myAdapter ;
    private List<MyData> myDatas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {

            myDatas.add( new MyData(i+""));
            Log.i(TAG, "initData: "+myDatas.toString());
        }

        myAdapter = new MyAdapter(myDatas,this);

    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }


}
