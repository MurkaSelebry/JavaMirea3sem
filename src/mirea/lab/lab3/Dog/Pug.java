package mirea.lab.lab3.Dog;

import mirea.lab.lab3.Dog.Dog;

public class Pug extends Dog {
    private double sweetnessMeter;
    public Pug(String name,int age,double sweetnessMeter){
        super(name,age);
        this.sweetnessMeter = sweetnessMeter;
    }
    public Pug(String name,double sweetnessMeter){
        super(name);
        this.sweetnessMeter = sweetnessMeter;
    }

    @Override
    public void sayDogName() {
        System.out.println("I am a PUG - CUTEST DOG");
    }
}
