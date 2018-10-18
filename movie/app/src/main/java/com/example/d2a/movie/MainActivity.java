package com.example.d2a.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ModelAdapter adapter;
    private ArrayList<Model> modelArrayList;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////button
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(
                new Button.OnClickListener()
                    {
                        public void onClick(View v)
                        {
                            Intent it = new Intent(v.getContext(), form.class);
                            startActivity(it);
                        }
                    }
        );

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new ModelAdapter(modelArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

       spinner1 = (Spinner) findViewById(R.id.spinner);
        //spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());


    }

    void addData(){
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("xxxx", "2", "coming soon"));
        modelArrayList.add(new Model("yyyy", "2", "coming soon"));
        modelArrayList.add(new Model("zzzz", "2", "coming soon"));
        modelArrayList.add(new Model("aaaa", "2", "coming soon"));
    }



}


