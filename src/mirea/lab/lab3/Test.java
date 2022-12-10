package mirea.lab.lab3;

import mirea.lab.lab3.Dish.CookingDish;
import mirea.lab.lab3.Dish.StorageDish;
import mirea.lab.lab3.Dog.Husky;
import mirea.lab.lab3.Dog.Pug;
import mirea.lab.lab3.Furniture.*;

public class Test {
    public static void main(String[] args){
        //Dish d = new Dish("d","s");
        CookingDish cd = new CookingDish("Frying pan","Cast Iron", "Frying");
        System.out.println(cd);
        StorageDish sd = new StorageDish("Container","Plastic", "Storage",5);
        System.out.println(sd);
        System.out.println("--------------------------------------------------------------------------------");
        Pug pug = new Pug("Pug_Cute",100);
        System.out.println(pug);
        pug.sayDogName();
        Husky husky = new Husky("Husky_Strong",2,100);
        System.out.println(husky);
        husky.sayDogName();
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.tryFurniture(FurnitureType.SOFA);
        furnitureShop.tryFurniture(FurnitureType.RUNDUK);
        furnitureShop.tryFurniture(FurnitureType.WARDROBE);
        furnitureShop.BuyFurniture(FurnitureType.SOFA);
        furnitureShop.dialogWithClient();
    }
}
