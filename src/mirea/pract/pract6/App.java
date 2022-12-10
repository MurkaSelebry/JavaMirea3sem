package mirea.pract.pract6;

public class App {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Idk", 4, 90);
        iDNumber[1] = new Student("Ida", 7, 35);
        iDNumber[2] = new Student("Idb", 2, 35);
        iDNumber[3] = new Student("Idc", 1, 100);
        iDNumber[4] = new Student("Idv", 6, 75);

        InsertsSorting.insertionSort(iDNumber);
        System.out.println("INSERTIONS SORT:");
        for (Student student : iDNumber) {
            System.out.println(student);
        }
        SortingStudentsByGPA.quickSort(iDNumber, 0, iDNumber.length - 1);
        System.out.println("QUICK SORT:");
        for (Student student : iDNumber) {
            System.out.println(student);
        }
         Student[] iDNumber2 = new Student[6];
         iDNumber2[0] = new Student("I0", 0, 100);
         iDNumber2[1] = new Student("I44", 44, 0);
         iDNumber2[2] = new Student("I5", 5, 12);
         iDNumber2[3] = new Student("I10", 10, 36);
         iDNumber2[4] = new Student("I22", 22, 80);
         iDNumber2[5] = new Student("I33", 33, 91);

         Student[] mergedArr = MergeStudents.mergeSort(iDNumber, iDNumber2);
        System.out.println("MERGED SORT:");
        for (Student student : mergedArr) {
            System.out.println(student);
         }
    }
}