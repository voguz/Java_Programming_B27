package day01_for_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
    /*
        Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
        Ex:
        Input:
        {"one", "hi", "hold"}

        Output:
        [ ***, **, **** ]
     */
            ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
            ArrayList<String> star = new ArrayList<>();

            for (String eachWord : password) { // eachWord = "apple", "tree"
                for (int i = 0; i < eachWord.length(); i++) {
                    eachWord = eachWord.replace(eachWord.charAt(i), '*'); // eachWord = "*****", "****"
                }
                star.add(eachWord);
            }

            System.out.println(password);
            System.out.println(star);







    }
}
