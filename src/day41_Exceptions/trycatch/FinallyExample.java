package day41_Exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter number 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            String s = null;
            s.trim();

            System.out.println(num1 + num2);
        } catch (InputMismatchException e) {
            System.out.println("Need to type number inputs");
        } finally { // this block of code will always run
            System.out.println("FINALLY RUN");
            input.close(); // closes the Scanner object
        }


    }


}
