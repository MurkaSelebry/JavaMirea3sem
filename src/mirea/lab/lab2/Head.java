package mirea.lab.lab2;

public class Head {
    private String hairColor;
    private int size;

    public Head(String hairColor, int size) {
        this.hairColor = hairColor;
        this.size = size;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public String toString(){
        return String.format("Hair color is %s and size is %d",hairColor,size);
    }
}
