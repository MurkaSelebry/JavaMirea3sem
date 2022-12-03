package mirea.pract.pract6;

public class MergeStudents {
    public static Student[] mergeSort(Student[] leftArr, Student[] secondArr) {
        Student[] totalArr = new Student[leftArr.length + secondArr.length];
        System.arraycopy(leftArr, 0, totalArr, 0, leftArr.length);
        System.arraycopy(secondArr, 0, totalArr, leftArr.length, secondArr.length);
        mergeSort(totalArr, 0, leftArr.length + secondArr.length - 1);
        return totalArr;
    }
    public static void mergeSort(Comparable[] arr, int l, int r) {
        if (l == r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        int i = l;
        int j = mid + 1;
        Comparable[] tmp = new Student[arr.length];
        for (int step = 0; step < r - l + 1; step++) {
            if ((j > r) || ((i <= mid) && (arr[i].compareTo(arr[j]) == -1))) {
                tmp[step] = arr[i];
                i++;
            } else {
                tmp[step] = arr[j];
                j++;
            }
        }
        if (r - l + 1 >= 0) System.arraycopy(tmp, 0, arr, l, r - l + 1);
    }
}
