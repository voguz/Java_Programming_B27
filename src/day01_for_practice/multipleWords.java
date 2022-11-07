package day01_for_practice;

public class multipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] items = words.split(", ");
        for (String eachItem : items) {
            if (eachItem.contains(" ")) {
                System.out.println(eachItem);
            }
        }



    }
}
