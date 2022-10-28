package mirea.pract1;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Harry","Hasky",2);
        d.petDog();
        System.out.println(d.toString());
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        Ball b = new Ball(Ball.BallsType.Basketball);
        System.out.println(b.toString());
        b.kickBall();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        Book book = new Book("Мертвые души","Гоголь Н.В.", 978517112);
        System.out.println(book.toString());
        book.readBook();
    }
}