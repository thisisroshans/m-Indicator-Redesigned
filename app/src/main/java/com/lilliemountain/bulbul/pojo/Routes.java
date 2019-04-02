package com.lilliemountain.bulbul.pojo;

import java.util.ArrayList;

public class Routes {
    String routeName;
    ArrayList<Tickets> tickets=new ArrayList<>();

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public ArrayList<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Tickets> tickets) {
        this.tickets = tickets;
    }

    public Routes(String routeName, ArrayList<Tickets> tickets) {
        this.routeName = routeName;
        this.tickets = tickets;
    }
}
