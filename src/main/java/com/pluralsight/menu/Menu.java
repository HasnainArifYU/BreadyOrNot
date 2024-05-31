package com.pluralsight.menu;

import com.pluralsight.sandwich.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Bread> breads;
    private List<Meat> meats;
    private List<Cheese> cheeses;
    private List<RegularToppings> regularToppings;
    private List<Sauces> sauces;

    public Menu() {
        this.breads = new ArrayList<>();
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        initializeMenu();
    }

    private void initializeMenu() {
        breads.add(new Bread("White"));
        breads.add(new Bread("Wheat"));
        breads.add(new Bread("Rye"));
        breads.add(new Bread("Wrap"));

        meats.add(new Meat("Steak", "Regular", false));
        meats.add(new Meat("Ham", "Regular", false));
        meats.add(new Meat("Salami", "Regular", false));
        meats.add(new Meat("Roast Beef", "Regular", false));
        meats.add(new Meat("Chicken", "Regular", false));
        meats.add(new Meat("Bacon", "Regular", false));

        cheeses.add(new Cheese("American", "Regular", false));
        cheeses.add(new Cheese("Provolone", "Regular", false));
        cheeses.add(new Cheese("Cheddar", "Regular", false));
        cheeses.add(new Cheese("Swiss", "Regular", false));

        regularToppings.add(new RegularToppings("Lettuce"));
        regularToppings.add(new RegularToppings("Peppers"));
        regularToppings.add(new RegularToppings("Onions"));
        regularToppings.add(new RegularToppings("Tomatoes"));
        regularToppings.add(new RegularToppings("Jalapenos"));
        regularToppings.add(new RegularToppings("Cucumbers"));
        regularToppings.add(new RegularToppings("Pickles"));
        regularToppings.add(new RegularToppings("Guacamole"));
        regularToppings.add(new RegularToppings("Mushrooms"));

        sauces.add(new Sauces("Ketchup"));
        sauces.add(new Sauces("Ranch"));
        sauces.add(new Sauces("Thousand Islands"));
        sauces.add(new Sauces("Vinaigrette"));
        sauces.add(new Sauces("Mayo"));
        sauces.add(new Sauces("Mustard"));
        sauces.add(new Sauces("Au Jus"));
        sauces.add(new Sauces("Sauce"));
    }

    public List<Bread> getBreads() {
        return breads;
    }

    public List<Meat> getMeats() {
        return meats;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public List<RegularToppings> getRegularToppings() {
        return regularToppings;
    }

    public List<Sauces> getSauces() {
        return sauces;
    }
}