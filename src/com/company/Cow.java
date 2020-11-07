package com.company;

public class Cow implements Animal {
    @Override
    public int amountOfLegs() {
        return 4;
    }

    @Override
    public void say() {
        System.out.println("moooo");
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canRun() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
