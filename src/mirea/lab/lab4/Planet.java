package mirea.lab.lab4;

public class Planet implements Nameable {
    private String title;
    public Planet(String title){
        this.title = title;
    }
    @Override
    public String getName(){
        return title;
    }
}
