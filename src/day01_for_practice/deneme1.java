package day01_for_practice;

public class deneme1 {
    public static void main(String[] args) {
        byte b =50;
        boolean check = b < 100;
        if (check){
            b-=25;
        }else {
            b = 100;
        }
        System.out.println(b);
    }
}
