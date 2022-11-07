package day01_for_practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: aaabbccdd
            Output: abc
         */

        String s1 = "AABCCCDDEFF";
        String S1new = "";
        for (int i = 0; i < s1.length(); i++) {


        for (int j = 0; j < s1.length(); j++) {

            if (!S1new.contains(s1.charAt(j) + "")) {
                S1new += s1.charAt(j);
            }

        }

        }
        System.out.println(S1new);

    }
}
