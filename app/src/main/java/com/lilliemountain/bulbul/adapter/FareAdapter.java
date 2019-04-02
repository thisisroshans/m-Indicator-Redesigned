package com.lilliemountain.bulbul.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lilliemountain.bulbul.R;
import com.lilliemountain.bulbul.pojo.Tickets;

import java.util.ArrayList;

public class FareAdapter extends RecyclerView.Adapter<FareAdapter.FareHolder> {
    ArrayList<Tickets> list=new ArrayList<>();

    public FareAdapter(ArrayList<Tickets> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FareHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ticket,viewGroup,false);
        return new FareHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FareHolder fareHolder, int i) {
    fareHolder.amount.setText("₹ "+list.get(i).getAmount()+" /-");
    fareHolder.ttype.setText(list.get(i).getTtype());
    fareHolder.jtype.setText("Journey type : "+list.get(i).getJtype());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FareHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView jtype,ttype,amount;
        ImageView ticket;
        public FareHolder(@NonNull View itemView) {
            super(itemView);
            amount=itemView.findViewById(R.id.amount);
            jtype=itemView.findViewById(R.id.jtype);
            ttype=itemView.findViewById(R.id.ttype);
            ticket=itemView.findViewById(R.id.imageView2);
            amount.setOnClickListener(this);
            jtype.setOnClickListener(this);
            ttype.setOnClickListener(this);
            amount.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),getAdapterPosition()+1,Toast.LENGTH_LONG).show();
        }
    }
}
