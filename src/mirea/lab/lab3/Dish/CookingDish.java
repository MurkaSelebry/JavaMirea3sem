package mirea.lab.lab3.Dish;

public class CookingDish extends Dish {
    private String purpose;
    public CookingDish(String name, String material, String purpose){
        super(name,material);
        this.purpose=purpose;
    }

    public void setPurpose(String purpose){this.purpose=purpose;}

    public String getPurpose(){return purpose;}

    @Override
    public String toString(){
        return String.format("%s %s %s",super.getName(),super.getMaterial(),purpose);
    }

}
