package com.pluralsight.sandwich;

import com.pluralsight.interfaces.Topping;

public class RegularToppings implements Topping {

    private String name;

    public RegularToppings(String name) {
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


