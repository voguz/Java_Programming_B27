package day01_for_practice;

import java.util.Scanner;

public class p_multi_branch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is your exam point?");
        int puan = input.nextInt();

        char sonuc;

        if (puan >= 90){
            sonuc = 'A';
        } else if (puan >= 80) {
            sonuc = 'B';
        } else if (puan >= 70 ) {
            sonuc = 'C';
        } else if (puan >= 60) {
            sonuc = 'D';
        } else {
            sonuc = 'F';
        }

        System.out.println(sonuc);

        if (sonuc == 'A'){
            System.out.println("Bravo");
        } else if (sonuc == 'B') {
            System.out.println("Good Job");

        } else if (sonuc == 'C') {
            System.out.println("Study");

        } else if (sonuc == 'D') {
            System.out.println("Study more");

        } else {
            System.out.println("Failed");
        }

    }
}
