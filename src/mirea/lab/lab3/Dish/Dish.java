package mirea.lab.lab3.Dish;

public abstract class Dish {
    private String name;
    private String material;

    protected Dish(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public abstract String toString();
}
