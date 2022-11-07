package day42_abstraction.exception_recap;

public class VendingMachine {
        /*
        Chips   Gum   Candy
         1        2      3

     */

    public static String select(int selection){

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
//            item = "Gum"; --> out of stock
        } else if(selection == 3){
            item = "Candy";
        }

        return item;
    }

}
