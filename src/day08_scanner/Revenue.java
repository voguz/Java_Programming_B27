package day08_scanner;

import java.util.Scanner;

public class Revenue {
    /*
    create a prog that will ask the user to enter a price and quantity and then calculate the revenue

     */
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
        System.out.println("Enter the items price");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Revenue: " + price * quantity);


    }
}
