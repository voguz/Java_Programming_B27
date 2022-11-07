package day36_custom_classes.FoodMarket;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {


            /*
        Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a' and print the whole information
        find all the Food objects that have a total price over 20 and print the name of the food
         */

    Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
    Food apples = new Food("apples");
    allFood[0] = apples; // storing the Food object, apples, into the Food array
    allFood[1] = new Food("Sushi", 10);
    allFood[2] = new Food("Cajun Pasta", 2, 3.99);
    allFood[3] = new Food("Kebab", 5, 2.5);
    allFood[4] = new Food("Plov", 4, 2.99);
        System.out.println(Arrays.toString(allFood));

        //print each food objects
        System.out.println();
        for(Food each : allFood){
            System.out.println(each);
        }

        //find all the food obj start with 'a' or 'c'
        for(Food each : allFood){
            if (each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }
        }
        System.out.println("Food that is over $7");
        for (Food each : allFood){
            if (each.totalPrice>=7){
                System.out.println(each.name);
            }

        }

}
}