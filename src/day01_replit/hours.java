package day01_replit;

import java.util.Scanner;

public class hours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int hours;
        int minutes;
        int seconds;
        System.out.println("Enter seconds:");
        seconds = input.nextInt();


        minutes =  seconds / 60 % 60 ;
        hours = seconds / 60 / 60 ;
        seconds %=   60;




        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");















    }
}
