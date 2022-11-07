package day01_for_practice;

import java.util.ArrayList;

public class WrapperPractice {
    public static void main(String[] args) {
        String num = "123";
        int number = Integer.parseInt(num);
        System.out.println(number);
        System.out.println("***---***---***---***");
        String abc ="456";
        double newNum =Double.parseDouble(abc);
        System.out.println(newNum);

        System.out.println("***---***---***---***");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("***---***---***---***");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 5){
                break;
            }
        }





    }
}
