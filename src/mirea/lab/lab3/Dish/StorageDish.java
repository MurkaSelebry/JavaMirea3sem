package mirea.lab.lab3.Dish;

import mirea.lab.lab3.Dish.Dish;

public class StorageDish extends Dish {
    private String purpose;
    private int storageSize;
    public StorageDish(String name, String material, String purpose,int storageSize){
        super(name,material);
        this.purpose = purpose;
        this.storageSize = storageSize;
    }

    public void setPurpose(String purpose){this.purpose=purpose;}

    public String getPurpose(){return purpose;}

    @Override
    public String toString(){
        return String.format("%s %s %s %d",super.getName(),super.getMaterial(),purpose, storageSize);
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}
