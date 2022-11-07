package day01_for_practice;

import java.util.Arrays;

public class deneme21 {
    public static void main(String[] args) {
       String [] fruits = {"apple", "banana", "Grape", "orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("***-***-***-***-***");
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);

        }
        System.out.println("***-***-***-***-***");
        for (String eachFruit : fruits) {
            System.out.println(eachFruit);

        }

        int[] number1 = {45,15,125,14,78,65,89};
        int[] number2 = Arrays.copyOf(number1 , 9);
        System.out.println(Arrays.toString(number2));
        System.out.println("***-***-***-***");
        int[] number3 = Arrays.copyOfRange(number1 , 1,4);
        System.out.println(Arrays.toString(number3));

        System.out.println("***-***-***");
        for (int number4 : number1) {
            System.out.println(number4);
        }



            }
        }
