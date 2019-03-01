package com.lilliemountain.bulbul.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lilliemountain.bulbul.R;
import com.lilliemountain.bulbul.pojo.fares.Tickets;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FareAdapter extends RecyclerView.Adapter<FareAdapter.FareHolder> {
    ArrayList<Tickets> list=new ArrayList<>();

    public FareAdapter(ArrayList<Tickets> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FareHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fare,viewGroup,false);
        return new FareHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FareHolder fareHolder, int i) {
        fareHolder.amount.setText("₹ "+list.get(i).getAmount()+" /-");
        fareHolder.jtype.setText("Journey type : "+list.get(i).getJtype());
        fareHolder.traintype.setText(list.get(i).getTrainspeed());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FareHolder extends RecyclerView.ViewHolder {
        TextView amount,jtype,traintype;
        public FareHolder(@NonNull View itemView) {
            super(itemView);
            amount=itemView.findViewById(R.id.amount);
            jtype=itemView.findViewById(R.id.jtype);
            traintype=itemView.findViewById(R.id.traintype);
        }
    }
}
