package day01_for_practice;

import java.util.Scanner;

public class forArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a Number");
        int number = input.nextInt();

        String[] wordToNumber = {"zero", "one", "two", "three", "four", "five"};
        System.out.println(wordToNumber[number]);


    }
}
