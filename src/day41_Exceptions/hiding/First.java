package day41_Exceptions.hiding;

public class First {
    public static void staticMethod(){
        System.out.println("Static method from First");
    }

    public void instanceMethodA(){
        staticMethod();
    }



}
