package day04_variables;

public class InfoAboutMe {
    public static void main(String[] args) {
        String name = "Volkan";
        String lastname = "Oguz";
        String born = "Malatya";
        int old = 34;
        double height = 6.2;
        String fan = "BJK";
        char letter = 'O';
        boolean result = true;

        System.out.println("His name is: " + name + "\nHis last name is: " + lastname);
        System.out.println("He was born in " + born + "\\"+ "he is" + old + "\\" + "years old");
        System.out.println("His"+ "\\" + height + "tall" + "\n\tHE IS A HUGE FAN OF " + fan);
        System.out.println("All this info is :" + result);
    }
}
