package mirea.lab.lab2;
import java.util.Calendar;
import java.util.Date;
public class BookTest {
        public static void main(String[] args){
            Book book = new Book("Мертвые души","Гоголь Н.В.", new Date(1842, Calendar.AUGUST,28),978517112);
            System.out.println(book.toString());
            book.readBook();
        }
}
