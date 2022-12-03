package mirea.pract.pract6;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int GPA;

    public Student(String name, int id, int GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student student) {
        if (id == student.id)
            return 0;
        else if (id > student.id)
            return 1;
        return -1;


    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, GPA: %d",id,name,GPA);
    }
}
