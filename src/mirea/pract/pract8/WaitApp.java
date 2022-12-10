package mirea.pract.pract8;

import mirea.pract.pract1.Dog;

import java.util.ArrayList;

public class WaitApp {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Dog testDog = new Dog("Alfred");
        dogs.add(testDog);
        dogs.add(new Dog());
        dogs.add(new Dog( 5));
        dogs.add(new Dog("Con","Bibbi" ,4));
        WaitList<Dog> waitList = new WaitList<>(dogs);
        System.out.println(waitList);
        waitList.add(new Dog("bad dob"));
        System.out.println(waitList.contains(testDog));
        System.out.println(waitList);
    }
}
