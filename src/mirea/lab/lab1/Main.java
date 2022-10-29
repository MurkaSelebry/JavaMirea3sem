package mirea.lab.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printArraysSum(){
        int[] arr = {9,56,2,62,-1,4,1,5,2};
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        System.out.printf("Сумма чисел массива arr(for): %d%n", s);
        s=0;
        int i=0;
        while(i!= arr.length){
            s+=arr[i];
            i++;
        }
        System.out.printf("Сумма чисел массива arr(while): %d%n", s);
        s=0;
        i=0;
        do{
            s+=arr[i];
            i++;
        }while(i!=arr.length);
        System.out.printf("Сумма чисел массива arr(do-while): %d%n", s);
    }
    public static void printArgs(String[] args){
        System.out.println("Аргументы командной строки: ");
        for (var el: args)
            System.out.println(el);
    }
    public static void printHarmonicNumbers(){
        System.out.println("Числа гармонического ряда: ");
        double s = 0;
        for(int i=1;i<=10;i++){
            s+=1.0/i;
            System.out.printf("%d: %f%n", i,s);
        }
    }
    public static void printRandomArray(){
        int[] arr= new int[(int) Math.round(Math.random()*10)];
        for(int i =0;i<arr.length;i++) arr[i]= (int) Math.round(Math.random()*10);
        System.out.println("Массив (1): ");
        for(int i =0;i<arr.length;i++) System.out.print(arr[i] + " ");
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Массив (2): ");
        for(int i =0;i<arr.length;i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static int getFactorial(int f){
        int s = 1;
        for(int i=1;i<=f;i++)
            s*=i;
        return s;
    }

    public static void main(String[] args) {
        printArraysSum();
        printArgs(args);
        printHarmonicNumbers();
        printRandomArray();
        System.out.printf("Факториал 7: %d%n", getFactorial(7));
    }
}

