package com.lilliemountain.bulbul;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.lilliemountain.bulbul.pojo.HomeIcons;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        recyclerView =  findViewById(R.id.recyclerView);
        recyclerView2 =  findViewById(R.id.recyclerView2);
        recyclerView3 =  findViewById(R.id.recyclerView3);
        recyclerView4 =  findViewById(R.id.recyclerView4);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        List<HomeIcons> firstlist=new ArrayList<>();
        firstlist.add(new HomeIcons(R.drawable.ic_local,"Local"));
        firstlist.add(new HomeIcons(R.drawable.ic_bus,"Bus"));
        firstlist.add(new HomeIcons(R.drawable.ic_express,"Express"));
        firstlist.add(new HomeIcons(R.drawable.ic_msrtc,"MSRTC"));
        firstlist.add(new HomeIcons(R.drawable.ic_train_chat,"Train Chat"));
        firstlist.add(new HomeIcons(R.drawable.ic_monorail,"Mono"));
        firstlist.add(new HomeIcons(R.drawable.ic_metro,"Metro"));
        firstlist.add(new HomeIcons(R.drawable.ic_rickshaw,"Auto"));
        firstlist.add(new HomeIcons(R.drawable.ic_cab,"Cab"));
        firstlist.add(new HomeIcons(R.drawable.ic_ship,"Ferry"));
        firstlist.add(new HomeIcons(R.drawable.ic_job,"Job"));
        firstlist.add(new HomeIcons(R.drawable.ic_map,"Map"));
        MumbaiAdapter adapter1=new MumbaiAdapter(firstlist);
        recyclerView.setAdapter(adapter1);

        List<HomeIcons> secondlist=new ArrayList<>();
        secondlist.add(new HomeIcons(R.drawable.ic_exhibition,"Mumbai Exhibition"));
        secondlist.add(new HomeIcons(R.drawable.ic_theatre,"Natak- Marathi Hindi Gujrati"));
        secondlist.add(new HomeIcons(R.drawable.ic_traffice_penalty_fine,"Penalty- Traffice and Railway"));
        secondlist.add(new HomeIcons(R.drawable.ic_rent,"Property"));
        secondlist.add(new HomeIcons(R.drawable.ic_picnic,"Picnic"));
        MumbaiAdapter adapter2=new MumbaiAdapter(secondlist);
        recyclerView2.setAdapter(adapter2);

        List<HomeIcons> thirdlist=new ArrayList<>();
        thirdlist.add(new HomeIcons(R.drawable.ic_emergency_contact,"Emergency Contacts"));
        thirdlist.add(new HomeIcons(R.drawable.ic_woman_safety,"Women Safety"));
        thirdlist.add(new HomeIcons(R.drawable.ic_police_stn,"Police Station Locator"));
        MumbaiAdapter adapter3=new MumbaiAdapter(thirdlist);
        recyclerView3.setAdapter(adapter3);

        List<HomeIcons> fourthlist=new ArrayList<>();
        fourthlist.add(new HomeIcons(R.drawable.ic_mumbai_map,"Mumbai Map"));
        fourthlist.add(new HomeIcons(R.drawable.ic_how_to_travel,"How to travel"));
        fourthlist.add(new HomeIcons(R.drawable.ic_popular_place,"Popular Places"));
        fourthlist.add(new HomeIcons(R.drawable.ic_shopping,"Shopping"));
        fourthlist.add(new HomeIcons(R.drawable.ic_food_and_drink,"Food and Drink"));
        fourthlist.add(new HomeIcons(R.drawable.ic_hotel,"Hotels"));
        MumbaiAdapter adapter4=new MumbaiAdapter(fourthlist);
        recyclerView4.setAdapter(adapter4);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
d
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
