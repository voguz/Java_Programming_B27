package day03_variables;

public class Practice {
    public static void main(String[] args) {

        /*
        date: mm\dd\yyyy
        date tomorrow
         */
    int day, month, year;
    day = 13;
    month = 6;
    year = 2022;
        System.out.println("Date of Today:" + month + "\\" +  day  + "\\" + year);
        day = 14;
        month = 6;
        year = 2022;
        System.out.println("Date of Tomorrow:" + month + "\\" +  day   + "\\" + year);


        System.out.println("*********************************************************");

        int a = 100;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("*******************************************************\n" );
        double x = 20.5;
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);









    }

}
