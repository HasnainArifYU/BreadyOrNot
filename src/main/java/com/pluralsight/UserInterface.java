package com.pluralsight;

import com.pluralsight.interfaces.Topping;
import com.pluralsight.menu.*;
import com.pluralsight.sandwich.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            exit = showHomeScreen();
        }
    }

    private static boolean showHomeScreen() {
        System.out.println("\n\n");
        System.out.println("============= BREADY OR NOT SANDWICHES ==================");
        System.out.println("                     Welcome!                     ");
        System.out.println("\n");
        System.out.println("1) Start a New Order");
        System.out.println("0) Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Please Enter Your Name: ");
                String Name = scanner.nextLine();
                System.out.println("Now please enter your Phone Number: ");
                String Number = scanner.nextLine();
                Order order = new Order(Name, Number);
                showOrderScreen(order);
                break;
            case 0:
                System.out.println("Thank You for visiting!");
                return true;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        return false;
    }



    private static void showOrderScreen(Order order) {
        while (true) {
            System.out.println("ORDER SCREEN\n");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Sandwich sandwich = createSandwich();
                    order.addSandwich(sandwich);
                    break;
                case 2:
                    Drink drink = addDrink();
                    order.addDrink(drink);
                    break;
                case 3:
                    Chips chips = addChips();
                    order.addChips(chips);
                    break;
                case 4:
                    checkout(order);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Sandwich createSandwich() {
        List<Topping> toppings = new ArrayList<>(); // to save selected toppings
        System.out.println(" Please choose your bread: ");
        System.out.println("1) White\n2) Wheat\n3) Rye\n4) Wrap");
        String breadInput = scanner.nextLine().trim();
        String bread;
        switch (breadInput.toLowerCase()) { // taking either int or String inputs
            case "1":
            case "white":
                bread = "White";
                break;
            case "2":
            case "wheat":
                bread = "Wheat";
                break;
            case "3":
            case "rye":
                bread = "Rye";
                break;
            case "4":
            case "wrap":
                bread = "Wrap";
                break;
            default:
                bread = "White";
                System.out.println("Invalid input. Defaulting to 'White'.");
                break;
        }
        Bread bread1 = new Bread(bread);

        System.out.println("Sandwich size (Small, Medium, or Large):"); //size
        String size = scanner.nextLine().trim();

        System.out.println("Select Premium Toppings:");
        System.out.println("MEAT:");
        System.out.println("1) Steak\n2) Ham\n3) Salami\n4) Roast Beef\n5) Chicken\n6) Bacon");
        String meatInput = scanner.nextLine().trim();
        String meat;
        switch (meatInput.toLowerCase()) {
            case "1":
            case "steak":
                meat = "Steak";
                break;
            case "2":
            case "ham":
                meat = "Ham";
                break;
            case "3":
            case "salami":
                meat = "Salami";
                break;
            case "4":
            case "roast beef":
                meat = "Roast Beef";
                break;
            case "5":
            case "chicken":
                meat = "Chicken";
                break;
            case "6":
            case "bacon":
                meat = "Bacon";
                break;
            default:
                meat = "Steak";
                System.out.println("Invalid input. Defaulting to 'Steak'.");
                break;
        }
        System.out.print("Do you want extra " + meat + "? (YES/NO): "); //Asking for extra meat
        boolean isExtraMeat = scanner.nextLine().trim().equalsIgnoreCase("yes");
        toppings.add(new Meat(meat, size, isExtraMeat));

        System.out.println("Cheese:");
        System.out.println("1) American\n2) Provolone\n3) Cheddar\n4) Swiss");
        String cheeseInput = scanner.nextLine().trim();
        String cheese;
        switch (cheeseInput.toLowerCase()) {
            case "1":
            case "american":
                cheese = "American";
                break;
            case "2":
            case "provolone":
                cheese = "Provolone";
                break;
            case "3":
            case "cheddar":
                cheese = "Cheddar";
                break;
            case "4":
            case "swiss":
                cheese = "Swiss";
                break;
            default:
                cheese = "American";
                System.out.println("Invalid input. Defaulting to 'American'.");
                break;
        }
        System.out.print("Do you want extra " + cheese + "? (YES/NO): ");
        boolean isExtraCheese = scanner.nextLine().trim().equalsIgnoreCase("yes");
        toppings.add(new Cheese(cheese, size, isExtraCheese));

        System.out.println("Other toppings:");
        System.out.println("Select regular toppings (Enter the number or name, type 'done' to finish):");
        String[] regularToppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
        for (int i = 0; i < regularToppings.length; i++) {
            System.out.println((i + 1) + ") " + regularToppings[i]);
        }
        while (true) {
            System.out.print("Enter the number or name of the topping to add (or type 'done' to finish): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String topping = null;
            try {
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= regularToppings.length) {
                    topping = regularToppings[choice - 1];
                }
            } catch (NumberFormatException e) {
                for (String option : regularToppings) {
                    if (option.equalsIgnoreCase(input)) {
                        topping = option;
                        break;
                    }
                }
            }
            if (topping == null) {
                System.out.println("Invalid input. Please enter a valid number or name.");
                continue;
            }
            System.out.print("Do you want extra " + topping + "? (YES?NO): ");
            boolean isExtra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            toppings.add(new RegularToppings(topping));
        }
        System.out.println("Select sauces (Enter the number or name, type 'done' to finish):");
        String[] sauces = {"Ketchup", "Ranch", "Thousand Islands", "Vinaigrette", "Mayo", "Mustard", "Au Jus", "Sauce"};
        for (int i = 0; i < sauces.length; i++) { // to display numbers next to the items
            System.out.println((i + 1) + ") " + sauces[i]);
        }
        while (true) {
            System.out.print("Enter the number or name of the sauce to add (or type 'done' to finish): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) { // exit check
                break;
            }
            String sauce = null;
            try {
                int choice = Integer.parseInt(input); // input format check
                if (choice > 0 && choice <= sauces.length) {
                    sauce = sauces[choice - 1];
                }
            } catch (Exception e) {
                for (String option : sauces) { // if not integer, save a string
                    if (option.equalsIgnoreCase(input)) {
                        sauce = option;
                        break;
                    }
                }
            }
            if (sauce == null) { // if null, print an error
                System.out.println("Invalid input. Please enter a valid number or name.");
                continue;
            }
            System.out.print("Do you want extra " + sauce + "? (YES/NO): ");
            boolean isExtra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            toppings.add(new Sauces(sauce));
        }
        System.out.println("Would you like the sandwich toasted? (YES/NO)");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");
        return new Sandwich(bread1, toppings, size, toasted);
    }


    private static Drink addDrink() {
        System.out.println("Select drink size: (small, medium, large)");
        String size = scanner.nextLine();
        size = size.toLowerCase();
        System.out.println("Enter drink flavor:");
        String flavor = scanner.nextLine();

        return new Drink(flavor, size);
    }

    private static Chips addChips() {
        System.out.println("Please select the flavor of your chips: BBQ, Ranch, Pickle ");
        String flavor = scanner.nextLine();
        return new Chips(flavor);
    }

    private static void checkout(Order order) {
        System.out.println("Checkout");
        System.out.println("-------------------------------------------------------------\n");
        order.displayOrderDetails();
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("1) Confirm");
        System.out.println("0) Cancel");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            order.createReceipt();
            System.out.println("Order Confirmed. Returning to home screen.");
        } else {
            System.out.println("Order Cancelled. Returning to home screen.");
        }
    }
}
