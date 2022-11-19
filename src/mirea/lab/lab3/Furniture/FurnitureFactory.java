package mirea.lab.lab3.Furniture;

public class FurnitureFactory {
    public Furniture makeFurniture(FurnitureType type) {
        Furniture furniture = null;
        switch (type) {
            case RUNDUK:
                furniture = new Runduk();
                break;
            case SOFA:
                furniture = new Sofa();
                break;
            case WARDROBE:
                furniture = new Wardrobe();
                break;
        }
        return furniture;
    }
    public Furniture makeRandomFurniture(FurnitureType type) {
        Furniture furniture = null;
        switch (type) {
            case RUNDUK:
                furniture = new Runduk(100,"Russia",5);
                break;
            case SOFA:
                furniture = new Sofa(250,"USA",50.0);
                break;
            case WARDROBE:
                furniture = new Wardrobe(300,"Sweden",200);
                break;
        }
        return furniture;
    }
}
