package day12_switch;

public class SwitchExample {
    public static void main(String[] args) {
        int day =3; //number from 1 to 7, where is 1 monday 7 sunday
        switch (day){
            default:
                System.out.println("Not a valid day number");
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;


        }
    }
}
