package day01_for_practice;

import java.util.Scanner;

public class practiceNeewww {
    public static void main(String[] args) {
        /*
        Declare and assign a String
        print the String in all uppercase format and
        print the String in all lowercase format
         */

        String name = "New VersioN";
        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        System.out.println("*****-******-********---*****");
        /*
        Declare and assign a String for password
        the password should be more than 8 character long
        print: Valid password or Invalid password

         */

        String password = "Brooklyn";
        int pass = password.length();
        System.out.println(pass);

        if (pass >= 8 ){
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        /*

        Use scanner to read a String from the console
        Remove extra spaces in the beginning or end
        Print in all lowercase
        Print the number of characters
         */

        Scanner input = new Scanner(System.in);
        System.out.println("what is your name & where are you from ?");
        String info = input.nextLine();

        info = info.trim();
        System.out.println(info);
        info = info.toLowerCase();
        System.out.println(info);

        info = info.toUpperCase();
        System.out.println(info);

        int infolen = info.length();
        System.out.println(infolen);










    }
}
