package mirea.pract.pract5;
import java.util.Scanner;

public class Solution {
    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n==0)
        {
            n = in.nextInt();
            if(n==0)//Условие выхода
                return 0;
        }
        // Шаг рекурсии / рекурсивное условие
        return (n==1) ? recursion11() + 1: recursion11();
    }
    public static void recursion12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {//Условие проверки на выход (при невыполнении)
            if (n % 2 == 1)
                System.out.println(n);
            // Шаг рекурсии / рекурсивное условие
            recursion12();
        }
    }
    public static void recursion13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {//Условие проверки на выход (при невыполнении)
            System.out.println(n);
            n = in.nextInt();
            // Базовый случай
            if(n>0)//Условие проверки на выход (при невыполнении)
                // Шаг рекурсии / рекурсивное условие
                recursion13();
        }
    }


    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------11 рекурсия-------------------------------------------------------------------------------------------");
        System.out.println(recursion11());// вызов рекурсивной функци
        System.out.println("-------------------------------------------------------------------------------------------12 рекурсия-------------------------------------------------------------------------------------------");
        recursion12();// вызов рекурсивной функци
        System.out.println("-------------------------------------------------------------------------------------------13 рекурсия-------------------------------------------------------------------------------------------");
        recursion13();// вызов рекурсивной функци
    }
}
