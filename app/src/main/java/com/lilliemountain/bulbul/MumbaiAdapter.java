package com.lilliemountain.bulbul;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lilliemountain.bulbul.pojo.HomeIcons;

import java.util.List;

public class MumbaiAdapter extends RecyclerView.Adapter<MumbaiAdapter.MumbaiHolder> {
    List<HomeIcons> homeIconsList;

    public MumbaiAdapter(List<HomeIcons> homeIconsList) {
        this.homeIconsList = homeIconsList;
    }

    @NonNull
    @Override
    public MumbaiHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home,viewGroup,false);
        return new MumbaiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MumbaiHolder mumbaiHolder, int i) {
        mumbaiHolder.photo.setImageResource(homeIconsList.get(i).getDrawable());
        mumbaiHolder.name.setText(homeIconsList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return homeIconsList.size();
    }

    public class MumbaiHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView photo;
        public MumbaiHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            photo=itemView.findViewById(R.id.image);
        }
    }
}
