package com.example.solidshop;

public class Meat extends Meal {
    private final String name = "Говядина";
    private final int price = 300;
    private int count;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }

    public Meat(int count) {
        this.count = count;
    }
}
