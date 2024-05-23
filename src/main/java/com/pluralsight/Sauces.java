package com.pluralsight;

public class Sauces implements Topping{

    private String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}
