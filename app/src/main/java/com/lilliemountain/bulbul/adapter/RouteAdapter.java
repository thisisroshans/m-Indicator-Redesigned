package com.lilliemountain.bulbul.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lilliemountain.bulbul.R;
import com.lilliemountain.bulbul.pojo.Routes;

import java.util.ArrayList;

public class RouteAdapter extends RecyclerView.Adapter<RouteAdapter.RouteHolder> {
    ArrayList<Routes> list;

    public RouteAdapter(ArrayList<Routes> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RouteHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_routes,viewGroup,false);
        return new RouteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RouteHolder routeHolder, int i) {
        routeHolder.routeName.setText("Route : "+list.get(i).getRouteName());
        FareAdapter fA=new FareAdapter(list.get(i).getTickets());
        routeHolder.routerec.setLayoutManager(new LinearLayoutManager(routeHolder.itemView.getContext(),LinearLayoutManager.HORIZONTAL,false));
        routeHolder.routerec.setAdapter(fA);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RouteHolder extends RecyclerView.ViewHolder {
        TextView routeName;
        RecyclerView routerec;
        public RouteHolder(@NonNull View itemView) {
            super(itemView);
            routeName=itemView.findViewById(R.id.routes);
            routerec=itemView.findViewById(R.id.faresrec);
        }
    }
}
