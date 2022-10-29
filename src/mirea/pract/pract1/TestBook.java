package mirea.pract.pract1;

public class TestBook {
    public static void test(){
        Book book = new Book("Мертвые души","Гоголь Н.В.", 978517112);
        System.out.println(book.toString());
        book.readBook();
    }
}
