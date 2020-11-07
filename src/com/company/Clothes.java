package com.company;

public class Clothes {
    protected String color;
    protected int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Clothes(String color, int cost) {
    }

    public Clothes() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
