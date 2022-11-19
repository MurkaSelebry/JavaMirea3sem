package mirea.lab.lab3.Furniture;

public class Wardrobe extends Furniture{
    private int countClothes;
    public Wardrobe(){
        super();
        countClothes = 5;
    }
    public Wardrobe(int price, String manufactureCountry, int countClothes){
        super(price,manufactureCountry);
        this.countClothes = countClothes;
    }
    public void FullWardrobe(){
        System.out.println("Wardrobe IS FULL!");
    }
    @Override
    public String toString() {
        return String.format("Wardrobe and its properties: \nCount of Clothes: %d \n%s",countClothes,super.toString());
    }
}
