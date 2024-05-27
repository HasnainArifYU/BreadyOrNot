package com.pluralsight.menu;

import com.pluralsight.interfaces.Topping;
import com.pluralsight.sandwich.Cheese;
import com.pluralsight.sandwich.Meat;
import com.pluralsight.sandwich.RegularToppings;
import com.pluralsight.sandwich.Sauces;

import java.util.ArrayList;
import java.util.List;

public class LoadMenu {

    public List<Meat> getMeatChoices() {

        List<Meat> meatChoices = new ArrayList<>();


        return meatChoices;
    }

    public List<Meat> getBread() {

        List<Meat> breadChoices = new ArrayList<>();
        breadChoices.add(new Meat("White"));
        breadChoices.add(new Meat("Wheat"));
        breadChoices.add(new Meat("Rye"));
        breadChoices.add(new Meat("Wrap"));


        return breadChoices;
    }

    public List<Cheese> getCheeses() {

        List<Cheese> cheeses = new ArrayList<>();


        return cheeses;
    }

    public List<RegularToppings> getVegetables() {

        List<RegularToppings> vegetables = new ArrayList<>();
        vegetables.add(new RegularToppings("Lettuce"));
        vegetables.add(new RegularToppings("Pepper"));
        vegetables.add(new RegularToppings("Onion"));
        vegetables.add(new RegularToppings("Tomato"));
        vegetables.add(new RegularToppings("Jalapenos"));
        vegetables.add(new RegularToppings("Cucumbers"));
        vegetables.add(new RegularToppings("Pickles"));
        vegetables.add(new RegularToppings("Guacamole"));
        vegetables.add(new RegularToppings("Mushrooms"));

        return vegetables;
    }

    public List<Sauces> getSauces() {

        List<Sauces> sauces = new ArrayList<>();
        sauces.add(new Sauces("Mayo"));
        sauces.add(new Sauces("Mustard"));
        sauces.add(new Sauces("Ketchup"));
        sauces.add(new Sauces("Ranch"));
        sauces.add(new Sauces("Thousand Islands"));
        sauces.add(new Sauces("Vinaigrette"));

        return sauces;
    }
    public static void printNumberedNames(List<? extends Topping> toppingList) {
        int counter = 1;
        for (Topping topping : toppingList) {
            System.out.println(counter + ". " + topping.getName());
            counter++;
        }
    }

}
