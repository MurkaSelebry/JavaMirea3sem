package mirea.pract.pract8;

public class User {

    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name: \"" + name + "\", age: \"" + age + "\"}";
    }
}
