package com.idev.verly.recyclerviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    WordListAdapter wordListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_list);

        rv.setHasFixedSize(true);

        wordListAdapter = new WordListAdapter(initData());

        rv.setAdapter(wordListAdapter);

        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    public LinkedList<Model> initData(){
        LinkedList<Model> list= new LinkedList<>();
        Model data1 =  new Model("verly","if 39-14","20");

        return list;
    }

}
