package questionsPractice;

import java.util.Arrays;

public class reverse02 {

    /*
    2. Array reverse. Write a method that will take an array as an argument and reverse it.

// revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
  // revArr({1})             -> {1}
  // revArr({1, 2, 3})       -> {3, 2, 1}

     */
    public static int[] arrayReverse(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, y = 0; i >= 0; i--, y++) {
            reverse[y] = arr[i];

        }

        return reverse;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(arrayReverse(arr)));
    }
}