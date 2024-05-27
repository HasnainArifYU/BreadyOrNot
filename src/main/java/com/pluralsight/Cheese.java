package com.pluralsight;

public class Cheese extends PremiumToppings {



    public Cheese(String Name, String size, boolean isExtraCheese) {
        super(Name, isExtraCheese, size);
    }

    public double getPrice(String size) {
        double price;
        switch (size.toLowerCase()) {
            case "small":
                price = 0.75;
                break;
            case "medium":
                price = 1.5;
                break;
            case "large":
                price = 2.25;
                break;
            default:
                throw new IllegalArgumentException("Invalid size");
        }
        if (isExtra()) {
            switch (size.toLowerCase()) {
                case "small":
                    price += 0.30;
                    break;
                case "medium":
                    price += 0.60;
                    break;
                case "large":
                    price += 0.9;
                    break;
            }
        }
        return price;
    }



}
