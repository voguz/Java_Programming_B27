package day19_loops;

public class Factorial {
    public static void main(String[] args) {

            /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

        int start = 1;
        int end = 7;
        int factorial = 1;// 1 because if you put zero, it will multiply by 0, result 0

        while (end >= start) {
            factorial *= end;
            end--;
        }
        System.out.println("Factorial: " + factorial);


    }
}
