package com.pluralsight.menu;

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



    public String getSize() {
        return size;
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

    public void display() {
        System.out.println(getName() +" "+ getSize());
    }

    public String toString() {
        return getName() +" "+ getSize()+"\n";
    }
}
