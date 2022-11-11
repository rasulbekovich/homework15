import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
        circle.circumference();
        double circleArea= Circle.area(15);
        double curcleCircumference=Circle.cercumference(13);
        System.out.println(circleArea);
        System.out.println(curcleCircumference);
    }
}