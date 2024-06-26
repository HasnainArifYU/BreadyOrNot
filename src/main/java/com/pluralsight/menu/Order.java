package com.pluralsight.menu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    String CustomerName;
    String CustomerNumber;
    List<Sandwich> sandwiches;
    List<Drink> drinks;
    List<Chips> chips;

    public Order(String customerName, String customerNumber, List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        CustomerName = customerName;
        CustomerNumber = customerNumber;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public Order(String customerName, String customerNumber) {
        CustomerName = customerName;
        CustomerNumber = customerNumber;
        sandwiches = new ArrayList<Sandwich>();
        drinks = new ArrayList<Drink>();
        chips = new ArrayList<Chips>();
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
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
        this.chips.add(chips);
    }

    public void displayOrderDetails() {
        System.out.println("Order Details: \n");
        System.out.println("Sandwiches: \n");
        for (Sandwich sandwich : sandwiches) {
            sandwich.displaySandwich();
        }
        System.out.println("\nDrinks:");
        for (Drink drink : drinks) {
            drink.display();
        }
        System.out.println("\nChips:");
        for (Chips chips : chips) {
            chips.display();
        }
        System.out.println("\nTotal Price: $" + getTotal());
    }

    public void createReceipt() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String dateTime = format.format(new Date());
        String filename = dateTime + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Order Details: \n");
            writer.write("----------------------------------\n");
            writer.write("Customer Name: " + this.getCustomerName()+"\n");
            writer.write(("Customer Number: " + this.getCustomerNumber()+"\n"));
            writer.write("----------------------------------\n");
            writer.write("\nSandwiches: \n");
            for (Sandwich sandwich : sandwiches) {
                writer.write(sandwich.toString());
            }
            writer.write("\n\nDrinks:");
            for (Drink drink : drinks) {
                writer.write(drink.toString());
            }

            writer.write("\n\nChips:\n");
            for (Chips chips : chips) {
                writer.write(chips.toString());
            }
            writer.write("----------------------------------------");
            writer.write("\n\nTotal Price: $" + getTotal() + "\n");
        } catch (Exception e) {
            System.out.println("An error occurred while writing the receipt.");
            e.printStackTrace();
        }
    }
}
