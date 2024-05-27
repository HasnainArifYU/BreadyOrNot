package com.pluralsight.sandwich;

public class Bread {
    private String name;


    public Bread(String type) {
        this.name = type;
    }

    public double getPrice(String size) {
        switch (size.toLowerCase()) {
            case "small":
                return 5.5;
            case "medium":
                return 7.0;
            case "large":
                return 8.5;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }
    }

    public String getType() {
        return name;
    }
}
