package day01_for_practice;

public class CountCharacter {
    public static void main(String[] args) {
        String example = "vo12KL5bu78numBr45";
        int number = 0;
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < example.length(); i++) {
            char eachone = example.charAt(i);
            if (eachone >= 'A' && eachone <= 'Z') {
                upper++;

            } else if (eachone >= 'a' && eachone <= 'z') {
                lower++;

            } else if (eachone >= '0' && eachone <= '9') {
                number++;
            }

        }
        System.out.println("upper " + upper);
        System.out.println("lower " + lower);
        System.out.println("number " + number);


    }
}
