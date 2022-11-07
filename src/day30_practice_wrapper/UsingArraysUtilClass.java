package day30_practice_wrapper;


import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {
    public static void main(String[] args) {

        int num = ArrayUtil.min(4, 2, 3, 9, 7);

        System.out.println(num);
        System.out.println(ArrayUtil.min(5, 8, 9, 1, 7, 6));
        System.out.println(ArrayUtil.max(8, 9, 7, 1, 2, 5, 6));
        int[] a = {45, 2, 6, 2, 6, 23, 83, 12};
        System.out.println(ArrayUtil.max(a));
        int[] b = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.contains(b, 13));
        System.out.println(ArrayUtil.contains(b, 5));
        System.out.println("index of");
        int[] c = {4, 2, 5, 1, 6};
        System.out.println("index of 5: " + ArrayUtil.indexOf(c, 5));
        System.out.println("index of 7: " + ArrayUtil.indexOf(c, 7));
        System.out.println("Add Element");
        String[] words = {"java", "is", "the", "best" };
// I wantto add : language into the array
        String[] allwords = ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allwords));


    }
}
