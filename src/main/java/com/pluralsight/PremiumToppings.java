package com.pluralsight;


public abstract class PremiumToppings implements Topping {

    private String name;
    private boolean extra;
    private String size;

    public PremiumToppings(String Name) {
        this.name=name;
    }

    public PremiumToppings(String name, String size) {
        this.name = name;
        this.extra = false;
    }

    public PremiumToppings(String name, boolean isExtra, String size) {
        this.name = name;
        this.extra = isExtra;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice(String size);

    public boolean isExtra() {
        return extra;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
