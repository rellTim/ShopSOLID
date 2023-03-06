package com.example.solidshop;

public class Meal {
    private String name;
    private int price;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getCount() + " шт. " + getName() + " на сумму: " + getPrice() * getCount() + " руб";
    }
}
