package com.lilliemountain.bulbul.pojo;

public class HomeIcons {
    int drawable;
    String name;

    public HomeIcons() {
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HomeIcons(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }
}
