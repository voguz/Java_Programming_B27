package day38_encapsulation;

public class AccessModifiers {
    public int a = 5; // butun classlarda calisir package de calisir cunku public
    int b = 10; // this has default access because I didn't use any other modifier // sadece ayni pakette calisir
    private int c = 20; // sadece bu class da calisir cunku private

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }

}
