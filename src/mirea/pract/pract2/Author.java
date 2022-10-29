package mirea.pract.pract2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if(gender=='M'||gender=='F') this.gender = gender;
        else this.gender='U';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        String appeal;
        if(gender=='M') appeal = "m";
        else if(gender=='F') appeal = "ms";
        else appeal = "them";
        return String.format("%s(%s) at %s", name,appeal,email);
    }
}
