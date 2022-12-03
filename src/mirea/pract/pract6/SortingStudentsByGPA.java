package mirea.pract.pract6;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGPA() == s2.getGPA()) {
            return 0;
        } else if (s1.getGPA() > s2.getGPA()) {
            return 1;
        } else {
            return -1;
        }
    }
    private static int partition(Student[] arr, int left, int right) {
        Student partition = arr[right];
        Student temp;
        int i = (left - 1);
        for (int j = left; j <= right - 1; j++) {
            if (new SortingStudentsByGPA().compare(arr[j], partition) != -1) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);
        }
    }
}
