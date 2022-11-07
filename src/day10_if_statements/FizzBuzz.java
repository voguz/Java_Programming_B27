package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
    [IQ] Given a number n , print the output based on the following condition
    the number if divisible by 3 print fizz
    divisible 5 print buzz
    divisible 3 and 5 print FizzBuzz
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give a Number");
        int num3 = input.nextInt();
        int num1 = 3;
        int num2 = 5;

        if (num3 % num1 == 0 && num3 % num2 == 0){
            System.out.println("FizzBuzz");
        } else if (num3 % num1 ==0 || num3 % num2 != 0) {
            System.out.println("Fizz");
        } else if (num3 % num1 != 0 || num3 % num2 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num3 + " It is not divisible");
        }


    }
}

