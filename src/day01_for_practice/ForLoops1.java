package day01_for_practice;


import java.util.Scanner;

public class ForLoops1 {
    public static void main(String[] args) {

        int secretNumber = 44;
        int guessNumber ;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Guess a num");
            guessNumber = input.nextInt();

            if (guessNumber > secretNumber){
                System.out.println("SN is lower");
            } else if (guessNumber < secretNumber) {
                System.out.println("SN is higher");

            }
        } while (guessNumber != secretNumber);
        System.out.println("Correct answer");
















    }
}
