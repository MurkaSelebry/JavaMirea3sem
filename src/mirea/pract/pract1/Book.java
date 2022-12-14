package mirea.pract.pract1;

public class Book {
    private String name,author;
    private long ISBN;

    public Book(String name, String author, long isbn) {
        this.name = name;
        this.author = author;
        ISBN = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public void readBook(){
        System.out.println("Start reading");
        for(int i=0;i<=100;i++){
            System.out.printf("Readed on %d%%%n", i);
        }
        System.out.printf("Wow, \"%s\" is so interesting%n", name);

    }

    public String toString() {
        return String.format("%s %s ISBN:%d",author,name,ISBN);
    }
}
