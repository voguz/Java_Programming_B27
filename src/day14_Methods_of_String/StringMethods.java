package day14_Methods_of_String;

public class StringMethods {
    public static void main(String[] args) {
        String item = "pen"; // in string pool
        String item2 = new String("pen"); //directly in heap
        System.out.println(item == item2); // this is not same
        String item3 = new String("pen");
        System.out.println(item2 == item3); // compares the two objects they are both in the heap
        //.equals(): compare the value of the Strings, which checks if the characters are the same
        System.out.println();

        System.out.println(item.equals("Pen")); // falls cunlu caseleri check ediyor
        System.out.println(item.equalsIgnoreCase("Pen"));// thats true bcs ignoring cases it means it is same

        System.out.println("**********");
        //.equals()
        //.equalsIgnoreCase()
        //.lenght()
        String day = "Tuesday";
        System.out.println(day.length()); // counts how many character there is
        String day2 = "Friday";
        int len = day2.length(); // length() method gives back int type, so we can use it however we want
        System.out.println(len);

        String str = " hello "; // the character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length()); // prints how many characters the String has, not the String
        // print(7)
        System.out.println(str);


    }
}
