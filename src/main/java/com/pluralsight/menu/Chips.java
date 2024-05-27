package com.pluralsight.menu;

public class Chips {
    private String type;
    private double price = 1.5;


    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public double getPrice() {
        return price;
    }


    public void display() {
        System.out.println(getType() + " chips");
    }
    public String toString() {
        return getType() + " chips \n";
    }
}
