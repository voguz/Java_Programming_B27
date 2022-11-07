package day08_scanner;

import java.util.Scanner;

public class AddNumbers {
    /*
    create a prog that will ask the user to enter two numbers. add the  numbers and print the results
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner object
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Total : " + sum);




    }
}
