package mirea.lab.lab3.Furniture;

public abstract class Furniture {
    protected int price;
    protected String manufactureCountry;
    Furniture(){
        price = 0;
        manufactureCountry = "";
    }
    Furniture(int price, String manufactureCountry){
        this.price = price;
        this.manufactureCountry = manufactureCountry;
    }
    abstract void Sell();

    @Override
    public String toString() {
        return String.format("Price: %d, \nCountry of Manufacture: %s",price,manufactureCountry);
    }
}
