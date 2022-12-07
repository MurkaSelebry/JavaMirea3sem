package mirea.pract.pract7;
import java.util.*;
public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void useStack(){
        Stack<Integer> deck1 = new Stack<>();
        Stack<Integer> deck2 = new Stack<>();
        Stack<Integer> deckTemp = new Stack<>();


        for (int i = 0; i < 10; i++) {
            deckTemp.push(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            deck2.push(deckTemp.pop());
        }
        for (int i = 0; i < 5; i++) {
            deck1.push(deckTemp.pop());
        }
        int card1, card2;
        int currentMove = 1;
        while(currentMove<=106){
            card1 = deck1.pop();
            card2 = deck2.pop();
            if (
                    (card1 > card2 || (card1 == 0 && card2 == 9)) &&
                            !(card1 == 9 && card2 == 0)
            ) {
                deck1.add(0,card1);
                deck1.add(0,card2);
            } else {
                deck2.add(0,card2);
                deck2.add(0,card1);
            }


            if (deck1.size() == 0) {
                System.out.println("second" + " " + currentMove);
                return;
            }

            if (deck2.size() == 0) {
                System.out.println("first" + " " + currentMove);
                return;
            }
            currentMove++;
        }
        System.out.println("botva");


    }
    public static void useDeque() {
        ArrayDeque<Integer> deck1 = new ArrayDeque<>();
        ArrayDeque<Integer> deck2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            deck1.addLast(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            deck2.addLast(scanner.nextInt());
        }

        int card1, card2;
        int currentMove = 1;
        while(currentMove<=106){
            card1 = deck1.pop();
            card2 = deck2.pop();
            if (
                    (card1 > card2 || (card1 == 0 && card2 == 9)) &&
                            !(card1 == 9 && card2 == 0)
            )             {
                deck1.addLast(card1);
                deck1.addLast(card2);
            } else {
                deck2.addLast(card2);
                deck2.addLast(card1);
            }


            if (deck1.size() == 0) {
                System.out.println("second" + " " + currentMove);
                return;
            }

            if (deck2.size() == 0) {
                System.out.println("first" + " " + currentMove);
                return;
            }
            currentMove++;
        }
        System.out.println("botva");
    }

    public static void useQue() {
        Queue<Integer> deck1 = new LinkedList<>();
        Queue<Integer> deck2 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            deck1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            deck2.add(scanner.nextInt());
        }
        int card1, card2;
        int currentMove = 1;
        while(currentMove<=106){
            card1 = deck1.poll();
            card2 = deck2.poll();
            if (
                    (card1 > card2 || (card1 == 0 && card2 == 9)) &&
                            !(card1 == 9 && card2 == 0)
            ) {
                deck1.add(card1);
                deck1.add(card2);
            } else {
                deck2.add(card2);
                deck2.add(card1);
            }


            if (deck1.size() == 0) {
                System.out.println("second" + " " + currentMove);
                return;
            }

            if (deck2.size() == 0) {
                System.out.println("first" + " " + currentMove);
                return;
            }
            currentMove++;
        }
        System.out.println("botva");
    }
    public static void useDoubleList() {
        LinkedList<Integer> deck1 = new LinkedList<>();
        LinkedList<Integer> deck2 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            deck1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            deck2.add(scanner.nextInt());
        }
        int card1, card2;
        int currentMove = 1;
        while(currentMove<=106){
            card1 = deck1.poll();
            card2 = deck2.poll();
            if (
                    (card1 > card2 || (card1 == 0 && card2 == 9)) &&
                            !(card1 == 9 && card2 == 0)
            ) {
                deck1.add(card1);
                deck1.add(card2);
            } else {
                deck2.add(card2);
                deck2.add(card1);
            }


            if (deck1.size() == 0) {
                System.out.println("second" + " " + currentMove);
                return;
            }

            if (deck2.size() == 0) {
                System.out.println("first" + " " + currentMove);
                return;
            }
            currentMove++;
        }
        System.out.println("botva");
    }
    public static void main(String[] args) {
        useStack();
        useDeque();
        useQue();
        useDoubleList();
    }
}


// Test for input

