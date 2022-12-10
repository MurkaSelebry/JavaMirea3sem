package mirea.lab.lab3.Furniture;

public class Sofa extends Furniture{
    private double softness;
    public Sofa(){
        super();
        softness = 100;
    }

    @Override
    void Sell(){
        System.out.printf("Sell %s for:%d%n",this,price);
    }

    public Sofa(int price, String manufactureCountry, double softness){
        super(price,manufactureCountry);
        this.softness = softness;
    }
    public void LieDown(){
        System.out.println("Sheeeeeeeeeeeeeeeeeeeeeeeeesh!");
    }
    @Override
    public String toString() {
        return String.format("Oh my god what a comfortable sofa and its properties: \nPercentage of Softness: %f \n%s",softness,super.toString());
    }
}
