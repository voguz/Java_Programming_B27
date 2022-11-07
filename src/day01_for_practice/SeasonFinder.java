package day01_for_practice;

public class SeasonFinder {
    public static void main(String[] args) {
        int number = 4;
        String message = "";

        switch (number) {
            case 1:
                message = "1\nits winter wear a coat";
                break;
            case 2:
                message = "2\nits winter wear a coat";
                break;
            case 3:
                message = "3\nits Spring take off a coat";
                break;
            case 4:
                message = "4\nits Spring take off a coat";
                break;
            case 6:
                message = "6\nits Summer wear t-shirt";
                break;
            case 9:
                message = "9\nits Fall wear a jacket";
                break;
        }
        System.out.println(message);
    }
}
