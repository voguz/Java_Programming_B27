package day01_for_practice;


import java.sql.SQLOutput;
import java.util.Scanner;

public class testdeneme {
    public static void main(String[] args) {
       // System.out.println(sayBye());
        Scanner input = new Scanner(System.in);
        System.out.println("What is your point?");
        point(input.nextInt());


    }
//    public static String sayBye(){
//        return "goodbye";
//    }


    public static void point(int score){
        if (score > 65){
            System.out.println("You passed");
        } else{
            System.out.println("You failed");
        }
    }








}
