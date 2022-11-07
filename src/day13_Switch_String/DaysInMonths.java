package day13_Switch_String;

public class DaysInMonths {
    public static void main(String[] args) {
        String month = "May";
        switch (month){
            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 Days");
                break;
            case "January":
            case "May":
            case "March":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Invalid Month");

        }


    }
}
