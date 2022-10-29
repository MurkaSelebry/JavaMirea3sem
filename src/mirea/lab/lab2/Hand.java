package mirea.lab.lab2;

public class Hand {
    private String predominant;
    private int length;

    public Hand(String predominant, int length) {
        this.predominant = predominant;
        this.length = length;
    }

    public String getPredominant() {
        return predominant;
    }

    public void setPredominant(String predominant) {
        this.predominant = predominant;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length= length;
    }
    public String toString(){
        return String.format("Predominant hand is %s and length is %d",predominant,length);
    }
}
