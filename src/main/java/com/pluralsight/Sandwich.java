package com.pluralsight;

import java.util.List;

public class Sandwich {

    private Bread bread;
    protected List<Topping> toppings;
    protected String size;
    protected boolean isToasted;

    public Sandwich(Bread bread, List<Topping> toppings, String size, boolean isToasted) {
        this.bread = bread;
        this.toppings = toppings;
        this.size = size;
        this.isToasted = isToasted;
    }


    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public double getTotal() {
        double total = 0;
        total += bread.getPrice(size);
        for (Topping topping : toppings) {
            total+=topping.getPrice(size);

        }
        return total;
    }
}