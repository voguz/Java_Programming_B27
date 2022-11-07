package day13_Switch_String;

public class Elevator {
    public static void main(String[] args) {
        int floor = 2;
        String companies;
        switch (floor){
            case 1 :
                companies = "Lobby, Starbucks, Amazon Pick up";
                break;
            case 2 :
                companies = "Nasa,Cydeo, Discover";
                break;
            case 3 :
                companies = "Uber, Lyft,Chase";
                break;
            case 4 :
                companies = "Rooftop, Lounge";
                break;
            default:
                companies = "Invalid Floor";

        }
        System.out.println("Floor " + floor + ": " + companies);


    }
}
