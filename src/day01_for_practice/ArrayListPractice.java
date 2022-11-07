package day01_for_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
       /*
       Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
        */

//        ArrayList<String> clothes = new ArrayList<>();
//        System.out.println(clothes);
//        clothes.add("Hat");
//        clothes.add("Shoes");
//        System.out.println(clothes);
//        clothes.add(1, "Jacket");
//        System.out.println(clothes);
//        clothes.add(0, "Towel");
//        System.out.println(clothes);
//        clothes.add(1, "Car");
//        System.out.println(clothes);
//        System.out.println("***-****-****-****-****-****");

        /*
        Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
//         */
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Iron Man");
//        names.add("Spider Man");
//        names.add("Thor");
//        names.add("Captain America");
//        names.add("Hawkeye");
//        System.out.println(names);
//        names.remove(2);
//        System.out.println(names);
//        names.remove("Iron Man");
//        System.out.println(names);
//        names.remove(0);
//        System.out.println(names);
//        System.out.println("***-***-***-***-***-****-***");
//        /*
//           Create an ArrayList of Characters
//           Fill the ArrayList with letters from a-z
//           Print the ArrayList of all the characters
//
//           Manually remove each vowels and print the new ArrayList
//         */
//
//        ArrayList<Character> letters = new ArrayList<>();
//        for (char i = 'a'; i <= 'z'; i++) {
//            letters.add(i);
//
//        }
//        System.out.println(letters);
//        letters.removeAll(Arrays.asList('a','e','u','o','i'));
//        System.out.println(letters);
//
//        System.out.println("***-****-****-****-*-*-*-****-");
//                /*
//        Try to loop:
//
//         Create an ArrayList of Double elements
//         Fill the ArrayList with some values
//         Find the max element from the ArrayList
//         */
//
//        ArrayList<Double> num = new ArrayList<>();
//        num.add(55.25);
//        num.add(12.22);
//        num.add(44.52);
//        num.add(11.11);
//        double max = 0.0;
//
//        for (Double each : num) {
//            if (each > max) {
//                max = each;
//            }
//
//        }
//        System.out.println(max);
//
//
//
        for (int i = 1; i < 50; i++) {
            int bolunebilen = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0 && j!=1){
                    bolunebilen++ ;
                }

            }
            if (bolunebilen == 0 ){
                System.out.println(i);
            }



        }
        System.out.println("***************");

        for (int i =1 ; i < 100; i++) {
            boolean isAsal = true ;
            for (int j = 1; j < i; j++) {
            if (i%j ==0 && j!=1){
                isAsal = false;

            }
            }
            if (isAsal){
                System.out.println(i);
            }

        }




    }
}
