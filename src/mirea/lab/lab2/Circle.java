package mirea.lab.lab2;


public class Circle{
    private double radius;

    public Circle() {
        this.radius = Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Circle: radius = %f", radius);
    }
}
