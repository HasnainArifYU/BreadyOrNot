package com.pluralsight.sandwich;

public class Meat extends PremiumToppings {

    public Meat(String Name, String size) {
        super(Name, size);
    }

    public Meat(String Name) {
        super(Name);
    }

    public Meat(String meat, String size, boolean isExtraMeat) {
        super(meat, isExtraMeat, size);
    }

    public double getPrice(String size) {
        double price;
        switch (size.toLowerCase()) {
            case "small":
                price = 1.0;
                break;
            case "medium":
                price = 2.0;
                break;
            case "large":
                price = 3.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid size");
        }
        if (isExtra()) {
            switch (size.toLowerCase()) {
                case "small":
                    price += 0.5;
                    break;
                case "medium":
                    price += 1.0;
                    break;
                case "large":
                    price += 1.5;
                    break;
            }
        }
        return price;
    }

}
