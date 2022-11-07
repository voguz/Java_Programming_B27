package day01_for_practice;

import java.util.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {2, 6, 8, 11, 13, 15, 25, 25, 24, 23, 21, 15, 14, 12, 2, 1};
        int even = 0;
        int odd = 0;
        System.out.println(Arrays.toString(nums));

        for (int eachNumber : nums) {
            if (eachNumber % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("even :" + even);
        System.out.println("odd :" + odd);


    }
}
