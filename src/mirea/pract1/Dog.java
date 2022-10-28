package mirea.pract1;
import java.lang.*;
public class Dog {
    private String name, breed;
    private int age;

    public Dog(){
        this.name = "Doggy";
        this.breed = "Mongrel";
        this.age = 0;
    }
    public Dog(String name) {
        this.name = name;
        this.breed = "Mongrel";
        this.age = 0;
    }
    public Dog(int age){
        this.name = "Doggy";
        this.breed = "Mongrel";
        this.age = age;
    }
    public Dog(String name , String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void petDog(){
        System.out.println("WOOF!");
    }


    public int intoHumanAge(){
        return age*7;
    }

    public String toString() {
        return String.format("This is %s of the %s breed he is %d years old",name,breed,age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
