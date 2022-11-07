package day06_operators;

public class practing {
    public static void main(String[] args) {
        System.out.println( 100 + 25);

        int a = 250 - 50 ;
        System.out.println(a);

        int vvv = -225;
        int bbb = +200;
        boolean aisGreater = vvv > bbb;
        boolean bisGreater = bbb > vvv;

        System.out.println("A is Greater " + aisGreater);
        System.out.println("B is Greater " + bisGreater);


        int j = 35;
         j++;
         j++;
         ++j;
         ++j;
         j--;
         --j;

        System.out.println(j);
        System.out.println("************");

        boolean result1 = 125 <= 126 ;
        System.out.println(result1);

        boolean result2 = 111==111;
        System.out.println(result2);

        System.out.println("************");

        int age = 21;

        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !hasCriminalBackground;
        System.out.println(isEligible);

        System.out.println("************");
        boolean isWeekend = true;
        boolean isGoodTemp = false;
        boolean doBbq = isWeekend && isGoodTemp; // && and both boolean need to be true, for true result
        /*
            this is not necessary
            isWeekend == true && isGoodTemp == true;
         */
        System.out.println("Do bbq: " + doBbq);
        System.out.println("************");

        int num = 5;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;
        System.out.println("IsEven = " + isEven);
        System.out.println("IsOdd = " + isOdd);





    }
}
