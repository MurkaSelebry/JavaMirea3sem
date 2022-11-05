package mirea.lab.lab3.Dog;

import mirea.lab.lab3.Dog.Dog;

public class Husky extends Dog {
    private double strongMeter;
    public Husky(String name,int age,double strongMeter){
        super(name,age);
        this.strongMeter = strongMeter;
    }
    public Husky(String name,double sweetnessMeter){
        super(name);
        this.strongMeter = strongMeter;
    }

    @Override
    public void sayDogName() {
        System.out.println("I am a Husky - Cool!");
    }
}
