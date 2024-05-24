package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        LoadMenu menu = new LoadMenu();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("---MENU----");
            System.out.println("1. New Order ");
            System.out.println("0. Exit ");

            System.out.println("Enter your choice... ");
            String choice = s.nextLine();

            switch (choice) {



            }
        }
    }

    private static void processOrder(){}

}
