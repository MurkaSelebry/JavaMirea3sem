package mirea.pract.pract5;
import java.util.Scanner;

public class Solution {
    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0)
        {
            n = in.nextInt();
            if(n==0)
                return 0;
        }
        return (n==1) ? recursion11() + 1: recursion11();
    }
    public static void recursion12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1)
                System.out.println(n);
            recursion12();
        }
    }
    public static void recursion13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            System.out.println(n);
            n = in.nextInt();
            if(n>0)
                recursion13();
        }
    }


    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------11 рекурсия-------------------------------------------------------------------------------------------");
        System.out.println(recursion11());
        System.out.println("-------------------------------------------------------------------------------------------12 рекурсия-------------------------------------------------------------------------------------------");
        recursion12();
        System.out.println("-------------------------------------------------------------------------------------------13 рекурсия-------------------------------------------------------------------------------------------");
        recursion13();
    }
}
