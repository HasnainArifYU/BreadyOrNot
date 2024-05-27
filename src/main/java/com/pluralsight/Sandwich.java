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

    public void displaySandwich() {
        System.out.println("Bread: " + this.bread.getType());
        System.out.println("Toppings : ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
        System.out.println(this.size);
        if (isToasted) {
            System.out.println("toasted.");
        }
    }

    public String toString(){
        String toReturn = "Bread : " + this.bread.getType();
        toReturn += "\nToppings : \n";
        for (Topping topping : toppings) {
            toReturn += topping.getName()+"\n";
        }
        toReturn += this.size+ "\n";
        if (isToasted) {
            toReturn += "toasted.";
        }
        return toReturn;
    }
}
