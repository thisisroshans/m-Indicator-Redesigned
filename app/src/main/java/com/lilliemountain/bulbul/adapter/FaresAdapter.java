package com.lilliemountain.bulbul.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lilliemountain.bulbul.R;
import com.lilliemountain.bulbul.pojo.fares.Route;

import java.util.ArrayList;

public class FaresAdapter extends RecyclerView.Adapter<FaresAdapter.FaresHolder> {
    ArrayList<Route> list=new ArrayList<>();

    public FaresAdapter(ArrayList<Route> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FaresHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_routes,viewGroup,false);
        return new FaresHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaresHolder faresHolder, int i) {
        faresHolder.routname.setText(list.get(i).getRoutname());
        FareAdapter fA=new FareAdapter(list.get(i).getTicketsArrayList());
        LinearLayoutManager llm=new LinearLayoutManager(faresHolder.itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
        faresHolder.recyclerView.setLayoutManager(llm);
        faresHolder.recyclerView.setAdapter(fA);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FaresHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        TextView routname;
        public FaresHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView=itemView.findViewById(R.id.fareRV);
            routname=itemView.findViewById(R.id.routName);
        }
    }
}
