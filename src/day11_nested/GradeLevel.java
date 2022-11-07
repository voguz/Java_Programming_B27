package day11_nested;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
/*
Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:
any number less than 1 or more than 18 is not valid
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
 */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your grade level?");
        int num = input.nextInt();

        if (num >= 1 && num <= 18) {
            if (num >= 1 && num <= 5) {
                System.out.println("Elementry school");
            } else if (num >= 6 && num <= 8) {
                System.out.println("Middle School");
            } else if (num >= 9 && num <= 12) {
                System.out.println("High School");
            } else if (num >= 13 && num <= 16) {
                System.out.println("College");
            } else if (num >= 17 || num <= 18) {
                System.out.println("Grand School");
            }
        } else {
            System.out.println("invalid grade level");

        }

    }
}
