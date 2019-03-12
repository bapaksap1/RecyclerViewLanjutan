package com.example.recyclerviewlanjutan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView,recyclerView1,recyclerView2;
    Adapter adapter;
    Presenter presenter;
    List<Model> models = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcv);
        recyclerView1 = findViewById(R.id.rcv1);
        recyclerView2 = findViewById(R.id.rcv2);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapter = new Adapter(this, models);
        recyclerView.setAdapter(adapter);
        presenter = new Presenter(this,this);
        presenter.setData();

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, models);
        recyclerView1.setAdapter(adapter);
        presenter = new Presenter(this,this);
        presenter.setData();

        recyclerView2.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        adapter = new Adapter(this, models);
        recyclerView2.setAdapter(adapter);
        presenter = new Presenter(this,this);
        presenter.setData();
    }

    @Override
    public void onSucsess(List<Model> models) {
        this.models.clear();
        this.models.addAll(models);
        this.adapter.notifyDataSetChanged();
    }
}