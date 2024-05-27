package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Sandwich> sandwiches;
    List<Drink> drinks;
    List<Chips> chips;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public Order() {
        sandwiches = new ArrayList<Sandwich>();
        drinks = new ArrayList<Drink>();
        chips = new ArrayList<Chips>();

    }

    public double getTotal() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total+=sandwich.getTotal();
        }
        for (Drink drink : drinks) {
            total+=drink.getPrice();
        }
        for (Chips chip : chips) {
            total+=chip.getPrice();
        }
        return total;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }
}
