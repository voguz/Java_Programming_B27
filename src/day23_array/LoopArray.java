package day23_array;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {4, 213, 6};
        System.out.println(Arrays.toString(nums)); //[4, 213, 6]

        // print each on a seperate line hard coded index
        System.out.println(nums[0]); //4
        System.out.println(nums[1]); //213
        System.out.println(nums[2]); //6

        // printing eash with for loop

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            /*
            4
            216
            6
             */
        }
        // create our own printing format:

        String arrayAsString = "Array ~ ";
        for (int i = 0; i < nums.length; i++) {
            arrayAsString += nums[i] + " | ";
        }
        arrayAsString += "~ END";
        System.out.println(arrayAsString);


        //go through with for each loop
        System.out.println("For each loop");

        for (int eachNumber : nums) {
            System.out.println(eachNumber); //bir deger assing yapti ve sonradan yazdirdi
        }


    }

}

