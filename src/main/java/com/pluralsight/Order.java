package com.pluralsight;

import java.util.List;

public class Order {
    List<Sandwich> sandwiches;
    List<Drink> drinks;
    List<Chips> chips;
    double total;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public Order() {
    }

    public double getTotal() {
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
}
