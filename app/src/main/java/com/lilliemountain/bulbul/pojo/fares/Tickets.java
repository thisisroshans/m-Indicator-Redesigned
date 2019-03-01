package com.lilliemountain.bulbul.pojo.fares;

public class Tickets {
    int amount;
    String jtype,trainspeed;

    public Tickets(int amount, String jtype, String trainspeed) {
        this.amount = amount;
        this.jtype = jtype;
        this.trainspeed = trainspeed;
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

    public String getTrainspeed() {
        return trainspeed;
    }

    public void setTrainspeed(String trainspeed) {
        this.trainspeed = trainspeed;
    }
}
