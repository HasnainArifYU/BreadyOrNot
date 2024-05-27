package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
            total += sandwich.getTotal();
        }
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        for (Chips chip : chips) {
            total += chip.getPrice();
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

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public void addChips(Chips chips) {
        this.addChips(chips);
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Sandwiches:");
        for (Sandwich sandwich : sandwiches) {
            sandwich.displaySandwich();
        }
        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            drink.display();
        }
        System.out.println("Chips:");
        for (Chips chips : chips) {
            chips.display();
        }
        System.out.println("Total Price: $" + getTotal());
    }

    public void createReceipt() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String dateTime = format.format(new Date());
        String filename = "receipts/" + dateTime + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Order Details:\n");
            writer.write("Sandwiches:\n");
            for (Sandwich sandwich : sandwiches) {
                writer.write(sandwich.toString() + "\n");
            }
            writer.write("Drinks:\n");
            for (Drink drink : drinks) {
                writer.write(drink.toString() + "\n");
            }
            writer.write("Chips:\n");
            for (Chips chips : chips) {
                writer.write(chips.toString() + "\n");
            }
            writer.write("Total Price: $" + getTotal() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the receipt.");
            e.printStackTrace();
        }
    }
}
