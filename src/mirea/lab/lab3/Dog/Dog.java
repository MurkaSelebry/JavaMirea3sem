package mirea.lab.lab3.Dog;

public abstract class Dog {
    private String name;
    private int age;

    protected Dog(){
        this.name = "Doggy";
        this.age = 0;
    }
    protected Dog(String name) {
        this.name = name;
        this.age = 0;
    }
    protected Dog(int age){
        this.name = "Doggy";
        this.age = age;
    }
    protected Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void petDog(){
        System.out.println("WOOF!");
    }


    public int intoHumanAge(){
        return age*7;
    }

    public String toString() {
        return String.format("This is %s of the %s breed he is %d years old",name,this.getClass().getName().split("\\.")[this.getClass().getName().split("\\.").length-1],age);
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

    public abstract void sayDogName();

}
