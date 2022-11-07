package day36_custom_classes.employee;

public class WorkV2 {
    public static void main(String[] args) {
        EmployeeV2 james2 = new EmployeeV2("James Bond", 7, "Spy", 10_000_000);
        System.out.println(james2);

        EmployeeV2 obj10 = new EmployeeV2("Ana");
        System.out.println(obj10);

        EmployeeV2 obj11 = new EmployeeV2("Jane", 9);
        System.out.println(obj11);

        EmployeeV2 obj12 = new EmployeeV2("Penny", 12, "CEO");
        System.out.println(obj12);


    }
}
