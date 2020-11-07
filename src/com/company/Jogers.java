package com.company;

public class Jogers extends Clothes{
    private boolean withBelt;
    Jogers (String color,int cost) {
        super(color,cost);
    }
    Jogers (String color,int cost, boolean withBelt) {
        this.color = color;
        this.cost = cost;
        this.withBelt = withBelt;
    }

    public boolean isWithBelt() {
        return withBelt;
    }

    public void setWithBelt(boolean withBelt) {
        this.withBelt = withBelt;
    }

    @Override
    public String toString() {
        return "Jogers{" +
                "withBelt=" + withBelt +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
