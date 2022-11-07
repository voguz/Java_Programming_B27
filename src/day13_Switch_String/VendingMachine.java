package day13_Switch_String;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*
        Vending Machine
        snack
        1-2-3
        drinks
        4-5-6
         */
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to the Vending Machine, Select to Menu***\n\tSnacks\n\tDrinks");
        String menu = input.next();

        switch (menu) {
            case "Snacks":
                System.out.println("Pick the snack\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();

                if (snackOption == 1) {
                    System.out.println("Chips are selected");

                } else if (snackOption == 2) {
                    System.out.println("Cookies are my Favorite");
                } else if (snackOption == 3) {
                    System.out.println("Pretzels dispensing");
                } else if (snackOption == 4) {
                    System.out.println("Candy coming right up");
                } else {
                    System.out.println("Not a valid choose");
                }
                break;


            case "Drinks":
                System.out.println("Pick the Drink\n1)Coke 2)Water 3)Energy Drink 4)Tea");
                int drinkOption = input.nextInt();

                if (drinkOption == 1) {
                    System.out.println("Enjoy your Coke");
                } else if (drinkOption == 2) {
                    System.out.println("Water is always healthy");
                } else if (drinkOption == 3) {
                    System.out.println("Your energy will be high");
                } else if (drinkOption == 4) {
                    System.out.println("Turkish tea is waiting for you");
                } else {
                    System.out.println("It is not a Correct chose");
                }
                break;  // we dont have other case so we dont need to put break

        }

    }
}
