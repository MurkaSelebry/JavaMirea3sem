package mirea.lab.lab4;

public class Test {
    public static void main(String[] args){
        Nameable nameable = new Animal("Bush");
        System.out.println(nameable.getName());
        nameable = new Car("BMW");
        System.out.println(nameable.getName());
        Car car = new Car("Toyota");
        nameable = car;
        System.out.println(car.getName());
        System.out.println((new Planet("Earth")).getName());
        System.out.println(nameable);
        System.out.println(car);
    }
}
