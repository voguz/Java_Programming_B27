package day22_tasks;

import java.util.Scanner;

public class NumberAsWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = {"one", "two", "there", "four", "five", "six", "seven", "eight", "nine", "ten"};
        System.out.println("Give a number");
        int NewNumber = input.nextInt();

        if (NewNumber >=1 && NewNumber <= 10) {
            System.out.println(numbers[NewNumber - 1]);
        } else {
            System.out.println("Invalid Number");
        }


    }
}
