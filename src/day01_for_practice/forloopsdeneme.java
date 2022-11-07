package day01_for_practice;

public class forloopsdeneme {
    public static void main(String[] args) {


        int num = 11;
        int value;
        String remainderValue = "";

        for (int i = 2; i < num; i++) {                     // i = 2,3,...,10
            value = num % i;             // 11 % 2 = 1, 11 % 3 = 2 ,11 % 4 = 3 , 11 % 5 = 1, 11 % 6 = 5, 11 % 7 = 4 , 11 % 8 = 3 , 11 % 9 = 2, 11 % 10 = 1;  11 is not completely divisible by any number, So it is Prime number.
            remainderValue += value;    // remainder stored in String remainderValue, line 23 remainderValue becomes = 123154321
        }

        if (remainderValue.contains("0")) {  // does remainderValue = 123154321 has 0? No, go to else in line 32
            System.out.println("Not Prime");
        } else {                            // number 11 is not completely divible by any number so it is PRime number.
            System.out.println("Prime Number");
        }

    }

}











