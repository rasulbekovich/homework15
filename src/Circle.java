import java.awt.geom.PathIterator;

public class Circle {
    public final double pi=3.14;
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void area(){
        System.out.println(pi*(radius * radius));
    }
    public void circumference(){
        System.out.println(pi*2*radius);
    }
    public static double area(double radius){
        final  double pi= 3.14;
        return pi * (radius*radius);
    }
    public static double cercumference(double radius){
        final double pi = 3.14;
        return pi*2*radius;
    }
}


