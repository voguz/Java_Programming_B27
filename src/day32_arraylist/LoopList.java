package day32_arraylist;

import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        for (String each : avengers) {
            if (each.contains(" ")) {
                int space = each.indexOf(" ") + 1;
                System.out.println(each.substring(0, 1) + each.substring(space, space + 1));
            } else {
                System.out.println(each.charAt(0));
            }

        }


    }


}
