package mirea.lab.lab3.Furniture;

public class Runduk extends Furniture{
    private int countRunes;
    public Runduk(){
        super();
        countRunes = 100;
    }
    public Runduk(int price, String manufactureCountry, int countRunes){
        super(price,manufactureCountry);
        this.countRunes = countRunes;
    }
    public void SearchRune(){
        System.out.println("Рундук - сундук для рун!");
    }
    @Override
    public String toString() {
        return String.format("I find a RUNDUK and its properties: \nCount of Runes: %d \n%s",countRunes,super.toString());
    }
}
