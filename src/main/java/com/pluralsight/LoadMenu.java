package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class LoadMenu {

    public List<Meat> getMeatChoices() {

        List<Meat> meatChoices = new ArrayList<>();
        meatChoices.add(new Meat("Chicken"));
        meatChoices.add(new Meat("Steak"));
        meatChoices.add(new Meat("Ham"));
        meatChoices.add(new Meat("Salami"));
        meatChoices.add(new Meat("Roast Beef"));
        meatChoices.add(new Meat("Bacon"));

        return meatChoices;
    }

    public List<Cheese> getCheeses() {

        List<Cheese> cheeses = new ArrayList<>();
        cheeses.add(new Cheese("American"));
        cheeses.add(new Cheese("Provolone"));
        cheeses.add(new Cheese("Swiss"));
        cheeses.add(new Cheese("Cheddar"));

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

}
