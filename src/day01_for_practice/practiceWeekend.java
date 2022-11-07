package day01_for_practice;

import java.util.Scanner;

public class practiceWeekend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num1 = input.nextInt();

        System.out.println("Enter a deciminal number");
        double num2 = input.nextDouble();

        input.nextLine(); //Enter

        System.out.println("Ask a word");
        String word = input.nextLine();


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("word = " + word);







    }
}
