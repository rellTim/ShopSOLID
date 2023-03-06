package com.example.solidshop;

public class Bread extends Meal {
    private final String name = "Хлеб";
    private final int price = 50;
    private int count;

    public Bread(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
