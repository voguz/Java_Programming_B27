package day38_encapsulation.Rectangle;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
//        rectangle1.length = 10;
//        rectangle1.width = 5;
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

//        System.out.println(rectangle1.length);
//        System.out.println(rectangle1.width);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());








    }
}
