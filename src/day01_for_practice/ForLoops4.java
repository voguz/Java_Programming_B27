package day01_for_practice;

public class ForLoops4 {
    public static void main(String[] args) {
        String name = "javajavaja";
        int count = 0;

        for (int v = count ; v < name.length(); v++){
            if (name.charAt(v) == 'a'){
                count++;
            }
        }

        System.out.println(count);


    }
}
