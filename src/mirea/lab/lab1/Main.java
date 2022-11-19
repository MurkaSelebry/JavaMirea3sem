package mirea.lab.lab1;

import java.util.Arrays;

public class Main {
    public static class RandomIntArray {
        private int[] arr;
        RandomIntArray(){
            arr= new int[(int) Math.round(Math.random()*10)];
            FillArray();
        }
        void FillArray(){
            for(int i =0;i<arr.length;i++) arr[i]= (int) Math.round(Math.random()*10);
        }
        void printArray(){
            for(int i =0;i<arr.length;i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
        void sortArray(){
            Arrays.sort(arr);
        }
        int[] getArr(){
            return arr;
        }
        void setArr(int[] arr){
            this.arr=arr;
        }
    }
    public static void printRandomArray(){
        RandomIntArray intArray = new RandomIntArray();
        System.out.println("Массив (1): ");
        intArray.printArray();
        intArray.sortArray();
        System.out.println("Массив (2): ");
        intArray.printArray();
    }

    public static void main(String[] args) {
        printRandomArray();
    }
}

