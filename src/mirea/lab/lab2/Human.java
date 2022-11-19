package mirea.lab.lab2;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    private int age;
    private String name;
    public Human(String HairColor, int size, String predomiant1, int length1, String predomiant2, int length2, int age, String name) {
        this.head = new Head(HairColor,length1);
        this.leg = new Leg(predomiant1,length1);
        this.hand = new Hand(predomiant2,length2);
        this.age = age;
        this.name = name;
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
}
