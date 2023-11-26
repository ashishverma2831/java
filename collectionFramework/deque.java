package collectionFramework;

import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ai = new ArrayDeque<>();

        ai.offerLast(10);
        ai.offerLast(20);
        ai.offerLast(30);
        ai.offerLast(40);
        ai.offerLast(50);

        ai.forEach(x->System.out.println(x));

        ai.offerFirst(1);
        ai.offerFirst(2);
        ai.offerFirst(3);
        ai.offerFirst(4);

        ai.forEach(x->System.out.println(x));
    }
}
