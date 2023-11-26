package collectionFramework;

import java.util.*;

public class linkedList{
    public static void main(String[] args) {
        
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(10,20,30,40,50));

        // ll1.add(90);
        // ll1.add(3,100);
        ll1.addAll(0, ll2);

        // System.out.println(ll1.indexOf(90));
        ll1.forEach(n->System.out.println(n));
    }
}