package com.lilliemountain.bulbul.pojo.fares;

import java.util.ArrayList;

public class Route {
    String routname;
    ArrayList<Tickets> ticketsArrayList;

    public Route(String routname, ArrayList<Tickets> ticketsArrayList) {
        this.routname = routname;
        this.ticketsArrayList = ticketsArrayList;
    }

    public String getRoutname() {
        return routname;
    }

    public void setRoutname(String routname) {
        this.routname = routname;
    }

    public ArrayList<Tickets> getTicketsArrayList() {
        return ticketsArrayList;
    }

    public void setTicketsArrayList(ArrayList<Tickets> ticketsArrayList) {
        this.ticketsArrayList = ticketsArrayList;
    }
}
