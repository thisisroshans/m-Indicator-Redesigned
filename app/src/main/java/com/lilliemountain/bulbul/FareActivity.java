package com.lilliemountain.bulbul;

import android.os.RecoverySystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.lilliemountain.bulbul.adapter.RouteAdapter;
import com.lilliemountain.bulbul.pojo.Routes;
import com.lilliemountain.bulbul.pojo.Tickets;

import java.util.ArrayList;
import java.util.List;

public class FareActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView, autoCompleteTextView2;
    List<String> stations = new ArrayList<>();
    RouteAdapter routeAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView2 = findViewById(R.id.autoCompleteTextView2);
        recyclerView = findViewById(R.id.routesrec);

        initStations();

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.item_atcv,R.id.name,stations);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView2.setAdapter(arrayAdapter);

        ArrayList <Routes> routes=new ArrayList<>();
        ArrayList <Tickets> fare1=new ArrayList<>();
        ArrayList <Tickets> fare2=new ArrayList<>();

        fare1.add(new Tickets("J","SLOW",10));
        fare1.add(new Tickets("J","SLOW",10));
        fare1.add(new Tickets("R","FAST",20));
        fare1.add(new Tickets("R","SLOW",20));

        fare2.add(new Tickets("J","SLOW",15));
        fare2.add(new Tickets("J","SLOW",15));
        fare2.add(new Tickets("R","FAST",30));
        fare2.add(new Tickets("R","SLOW",30));

        routes.add(new Routes("Basic route ",fare1));
        routes.add(new Routes("Another route ",fare2));

        routeAdapter=new RouteAdapter(routes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(routeAdapter);

    }
    void initStations()
    {
        stations.add("Airoli");
        stations.add("Ambarnath");
        stations.add("Ambivli");
        stations.add("Andheri");
        stations.add("Asangaon");
        stations.add("Atgaon");
        stations.add("Badlapur");
        stations.add("Baman Dongari");
        stations.add("Bandra");
        stations.add("Bhandup");
        stations.add("Bhayandar");
        stations.add("Bhivpuri Road");
        stations.add("Bhiwandi");
        stations.add("Boisar");
        stations.add("Borivali");
        stations.add("Byculla");
        stations.add("CBD Belapur");
        stations.add("Charni Road");
        stations.add("Chembur");
        stations.add("Chhatrapati Shivaji Maharaj Terminus");
        stations.add("Chinchpokli");
        stations.add("Chunabhatti");
        stations.add("Churchgate");
        stations.add("Cotton Green");
        stations.add("Currey Road");
        stations.add("Dadar");
        stations.add("Dahanu Road");
        stations.add("Dahisar");
        stations.add("Dativali");
        stations.add("Diva");
    }

}