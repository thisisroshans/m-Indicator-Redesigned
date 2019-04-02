package com.lilliemountain.bulbul.pojo;

public class Tickets {
    String jtype,ttype;
    int amount;

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }

    public Tickets(String jtype, String ttype, int amount) {
        this.jtype = jtype;
        this.ttype = ttype;
        this.amount = amount;
    }
}
