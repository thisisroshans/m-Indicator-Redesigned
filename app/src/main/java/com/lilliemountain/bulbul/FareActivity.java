package com.lilliemountain.bulbul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Switch;
import android.widget.TextView;

import com.lilliemountain.bulbul.adapter.FaresAdapter;
import com.lilliemountain.bulbul.pojo.fares.Route;
import com.lilliemountain.bulbul.pojo.fares.Tickets;

import java.util.ArrayList;
import java.util.List;

public class FareActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Switch type;
    AutoCompleteTextView start,end;
    TextView ii,i,ac,all;
    ArrayList<Route> routes=new ArrayList<>();
    List<String> stations=new ArrayList<>();
    FaresAdapter faresAdapter;
    ArrayAdapter stationsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);
        initUI();
    }

    void initUI()
    {
        recyclerView=findViewById(R.id.faresRV);
        type=findViewById(R.id.type);
        start=findViewById(R.id.start);
        end=findViewById(R.id.end);
        ii=findViewById(R.id.general);
        i=findViewById(R.id.fc);
        ac=findViewById(R.id.ac);
        all=findViewById(R.id.all);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        initDataSet();


    }

    void initDataSet()
    {
        ArrayList<Tickets> tickets=new ArrayList<>();
        tickets.add(new Tickets(10,"J","slow"));
        tickets.add(new Tickets(10,"R","slow"));
        tickets.add(new Tickets(10,"J","fast"));
        tickets.add(new Tickets(10,"J","slow"));
        routes.add(new Route("Route 1:",tickets));
        routes.add(new Route("Route 2:",tickets));
        faresAdapter=new FaresAdapter(routes);
        recyclerView.setAdapter(faresAdapter);


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

        stationsAdapter =new ArrayAdapter<>(getBaseContext(),R.layout.item_actv,R.id.text1,stations);

        start.setAdapter(stationsAdapter);
        end.setAdapter(stationsAdapter);
    }



}
