package day05_arithmetic_operators;

public class ArithmeticOperators {
    public static void main (String [] args)
    {
        String firstName = "Tony";
        String lastName = "Montana";
        String companyName = "MI6";
        String jobTitle = "Mafia";
        char suite = 'V';
        int employeeId = 7;
        int numberOfPto = 13;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + "@" + companyName + ".com";
        String benefits = "$" + salary + "salary a year, " + numberOfPto + " PTO days and WFH ";
        String summary = "Employee Information for " + fullName + ". " + jobTitle + " for " + companyName + ", based in suite " + suite + "Mr/Mrs " + lastName + "is full time " + isFullTime + ".Contact " + lastName + " at " + email + ".Current benefits include " + benefits;

        System.out.println(summary);


    }
}
