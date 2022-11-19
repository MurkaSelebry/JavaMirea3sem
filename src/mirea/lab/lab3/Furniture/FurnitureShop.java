package mirea.lab.lab3.Furniture;

import java.util.Scanner;

public class FurnitureShop {
    private FurnitureFactory furnitureFactory;
    public  FurnitureShop(){
        furnitureFactory = new FurnitureFactory();
    }
    public FurnitureShop(FurnitureFactory furnitureFactory){
        this.furnitureFactory = furnitureFactory;
    }
    public void dialogWithClient(){
        Scanner in = new Scanner(System.in);
        System.out.print("Что вы хотите купить: \n1)Рундук \n2)Софа \n3)Шкаф \nВаш выбор: ");
        int num = in.nextInt();
        if(num>=1 && num <=3)
            BuyFurniture(FurnitureType.values()[num-1]);
    }
    public Furniture BuyFurniture(FurnitureType type) {
        Furniture furniture = furnitureFactory.makeRandomFurniture(type);
        furniture.Sell();
        System.out.println("Спасибо за покупку!");
        return furniture;
    }
    public void tryFurniture(FurnitureType type) {
        Furniture furniture = furnitureFactory.makeFurniture(type);
        switch (type) {
            case RUNDUK:
                ((Runduk)furniture).SearchRune();
                break;
            case SOFA:
                ((Sofa)furniture).LieDown();
                break;
            case WARDROBE:
                ((Wardrobe)furniture).FullWardrobe();
                break;
        }
    }

}
