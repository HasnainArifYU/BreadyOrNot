package com.pluralsight.sandwich;

import com.pluralsight.interfaces.Topping;

public class Sauces implements Topping {

    private String name;

    public Sauces(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}
