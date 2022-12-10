package mirea.lab.lab8;

import java.io.*;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("notes.txt", true))
        {
            // запись всей строки
            Scanner sc = new Scanner(System.in);
            StringBuilder text= new StringBuilder();
            while(sc.hasNextLine()) {
                var line = sc.nextLine();
                if(line.equals("end"))
                    break;
                text.append(line).append('\n');
            }
            writer.write(text.toString());
            // запись по символам

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}