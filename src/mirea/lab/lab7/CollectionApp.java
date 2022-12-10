package mirea.lab.lab7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CollectionApp {
    public static void testMy(){
        MyArrayList<String> states = new MyArrayList<String>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект

        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }
        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
    public static void testCollection(){
        ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }
        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("MY ARRAY LIST OUTPUT: ");
      //  PrintStream printStream = new PrintStream(new FileOutputStream("out_JAVA.txt"));
     //   System.setOut(printStream);
        testMy();
       // System.setOut(new PrintStream(System.out));
        System.out.println("ARRAY LIST OUTPUT: ");
        testCollection();
    }
}

