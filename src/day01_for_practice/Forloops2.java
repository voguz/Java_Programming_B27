package day01_for_practice;

public class Forloops2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("***-***-***-***");

        int num = 5;
        for (int v = 1; v <= 10; v++){
            System.out.println(num + "x" + v +"= " + num*v);
        }

        System.out.println("***-***-***");
        int start = 1;
        int end = 7;
        int factorial = 1;

        while (start <= end){
            factorial *= start;
            start++;
        }

        System.out.println("factorial :" + factorial);



    }
}
