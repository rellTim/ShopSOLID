package com.example.solidshop;

public class Milk extends Meal {
    private final String name = "Молоко";
    private final int price = 90;
    private int count;

    public Milk(int count) {
        this.count = count;
    }

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
}
