package mirea.pract.pract3.WorkWithInterfaces;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 10, 50 , -50);
        System.out.println(point);
        point.moveUp();
        point.moveDown();
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        MovableCircle circle = new MovableCircle(-10, -10, 50, 150, 100);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveRight();
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        MovableRectangle rectangle = new MovableRectangle(0, 0, 100, 100, -100, 100);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveUp();
        rectangle.moveUp();
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
