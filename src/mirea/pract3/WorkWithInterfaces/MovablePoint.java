package mirea.pract3.WorkWithInterfaces;


public class MovablePoint implements Movable {
    private int x;
    private int y;

    //type of visibility is package, so we can write protected that MovableCircle can see this variables
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return String.format("X: x = %d, speed = %d\nY: y= %d, speed = %d",x,xSpeed,y,ySpeed);
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
