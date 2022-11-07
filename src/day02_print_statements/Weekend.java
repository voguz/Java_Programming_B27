package day02_print_statements;

public class Weekend {
    public static void main (String [] args)
    {
        System.out.println("Today is \" Friday \" ");
        System.out.println("Shopping List:\n-Juice\n\t-Food\n\t\t-Ice cream\n\t\t\t-Fruit");

        System.out.println("WELCOME TO THE STORE");
        System.out.println("**********************");
        System.out.println("");
        double Cake, Water, AppleJuice, Bread, Total, Tax, GrandTotal;
        Cake = 24.00 ;
        System.out.println("Cake =$" +  Cake );

        AppleJuice = 7.50 ;
        System.out.println("AppleJuice =$" + AppleJuice );

        Water = 3.99 ;
        System.out.println("Water =$" + Water  );

        Bread = 4.25 ;
        System.out.println("Bread =$" +  Bread );


        Total = Cake+Water+AppleJuice+Bread;
        Tax = 3.00 ;
        GrandTotal = Total + Tax;
        System.out.println("Total =$" + Total );
        System.out.println("Tax =$" + Tax);
        System.out.println("GrandTotal =$" + GrandTotal);

        System.out.println("Today is \"Friday\" ");









    }



}
