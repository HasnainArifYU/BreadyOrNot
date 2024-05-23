package com.pluralsight;


public abstract class PremiumToppings implements Topping {

    private String name;
    private double smallPrice;
    private double mediumPrice;
    private double largePrice;
    private double smallExtra;
    private double mediumExtra;
    private double largeExtra;

    public PremiumToppings(String name, double smallPrice, double mediumPrice, double largePrice, double smallExtra, double mediumExtra, double largeExtra) {
        this.name = name;
        this.smallPrice = smallPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;
        this.smallExtra = smallExtra;
        this.mediumExtra = mediumExtra;
        this.largeExtra = largeExtra;
    }

    public String getName() {
        return name;
    }

    public double getPrice(String size) {
        switch (size.toLowerCase()) {
            case "small": return smallPrice;
            case "medium": return mediumPrice;
            case "large": return largePrice;
            default: throw new IllegalArgumentException("Invalid size");
        }
    }

    public double getSmallPrice() {
        return smallPrice;
    }

    public double getMediumPrice() {
        return mediumPrice;
    }

    public double getLargePrice() {
        return largePrice;
    }

    public double getSmallExtra() {
        return smallExtra;
    }

    public double getMediumExtra() {
        return mediumExtra;
    }

    public double getLargeExtra() {
        return largeExtra;
    }
}
