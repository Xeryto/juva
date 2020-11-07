package com.company;

public class Fish implements Animal{
    @Override
    public int amountOfLegs() {
        return 0;
    }

    @Override
    public void say() {
        System.out.println("boop");
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canRun() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
