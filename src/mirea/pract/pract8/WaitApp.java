package mirea.pract.pract8;

import mirea.pract.pract1.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitApp {
    public static void main(String[] args){
        System.out.println("Enter capacity of bounded list");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        BoundedWaitList boundedWaitList = new BoundedWaitList<>(capacity);
        for (int i = 0; i < capacity; i++){
            boundedWaitList.add(i);
        }
        System.out.println(boundedWaitList);
        boundedWaitList.add(12);
        UnfairWaitList unfairWaitList = new UnfairWaitList();
        for (int i = 0; i < 10; i++){
            unfairWaitList.add(i);
        }
        System.out.println(unfairWaitList);
        unfairWaitList.remove(8);
        System.out.println(unfairWaitList);
        unfairWaitList.remove(0);
        System.out.println(unfairWaitList);
        unfairWaitList.add(8);

    }
}
