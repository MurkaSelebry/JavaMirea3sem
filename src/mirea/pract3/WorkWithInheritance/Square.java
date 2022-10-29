package mirea.pract3.WorkWithInheritance;

import mirea.pract3.WorkWithInheritance.Rectangle;

public class Square extends Rectangle {
    public Square() {
        super(10, 10);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return String.format("Square: side = %f, color - %s, filled - %b",length,color,filled);
    }
}