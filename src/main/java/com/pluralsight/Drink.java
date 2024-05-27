package com.pluralsight;

public class Drink {

    private String name;
    private String size;



    public Drink(String Name, String size) {
        this.name = Name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        switch (size.toLowerCase()) {
            case "small":
                return 2.0;
            case "medium":
                return 2.5;
            case "large":
                return 3.0;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }
    }
}
