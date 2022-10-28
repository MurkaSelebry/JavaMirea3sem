package mirea.pract1;

public class TestBall {
    public static void test(){
        Ball b = new Ball(Ball.BallsType.Basketball);
        System.out.println(b.toString());
        b.kickBall();
    }
}
