package mirea.pract.pract6;

public class InsertsSorting {
    public static void insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key)==1) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
