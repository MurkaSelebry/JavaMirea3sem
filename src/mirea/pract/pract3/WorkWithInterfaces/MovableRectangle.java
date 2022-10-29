package mirea.pract.pract3.WorkWithInterfaces;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return String.format("*Rectangle*\nTop Left Point {\n%s\n}\nBottom Right Point {\n%s\n}",topLeft.toString(),bottomRight.toString());
    }

    @Override
    public void moveUp() {
        if (checkXYSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkXYSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkXYSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (checkXYSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    private boolean checkXYSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed)&&(topLeft.ySpeed == bottomRight.ySpeed);
    }
}
