package mirea.pract.pract2;

public class TestAuthor {
    public static void test(){
        Author author = new Author("Bruce Lee", "brucelee@cool.com", 'M');
        System.out.println(author.toString());
        Author author1 = new Author("Makima","makima@ControlDevil.jp",'F');
        System.out.println(author1.toString());
        Author author2 = new Author("None","none@none.none",'U');
        System.out.println(author2.toString());
    }
}
