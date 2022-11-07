package day36_custom_classes.employee;

public class Work {
    public static void main(String[] args) {
        EmpOne volkan = new EmpOne("volkan Oguz", 21, "SDET", 250_000_000);
        volkan.goToMeeting();
        System.out.println(volkan);
        // we are not providing all values
        EmpOne obj2 = new EmpOne("Ana");
        System.out.println(obj2);

        EmpOne obj3 = new EmpOne("Jane", 9);
        System.out.println(obj3);

        EmpOne obj4 = new EmpOne("Penny", 12, "CEO");
        System.out.println(obj4);


    }
}
