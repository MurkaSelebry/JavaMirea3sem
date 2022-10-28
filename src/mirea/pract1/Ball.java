package mirea.pract1;
import java.lang.*;
public class Ball {
    enum BallsType { Football, Volleyball, Basketball, WaterPolo }
    private BallsType type;
    private int size;
    private double weight;

    public Ball(BallsType type){
        this.type = type;
        switch (type) {
            case Football -> {
                this.weight = 450;
                this.size = 5;
            }
            case Volleyball -> {
                this.weight = 250;
                this.size = 5;
            }
            case Basketball -> {
                this.weight = 650;
                this.size = 7;
            }
            case WaterPolo -> {
                this.weight = 400;
                this.size = 5;
            }
        }
    }

    public Ball(BallsType type, int size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public BallsType getType() {
        return type;
    }

    public void setType(BallsType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public void kickBall(){
        System.out.println("Whizzz....");
    }


    public String toString() {
        return String.format("%s ball weighing %f grams and sized %d",type.toString(),weight,size);
    }



}
