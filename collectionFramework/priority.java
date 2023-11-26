package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {

        // PriorityQueue<Integer> pi = new PriorityQueue<>(new myCom());
        PriorityQueue<Integer> pi = new PriorityQueue<>();

        pi.add(20);
        pi.add(10);
        pi.add(30);
        pi.add(5);
        pi.add(15);
        pi.add(3);

        System.out.println(pi.peek());

        pi.forEach(x->System.out.println(x));

        pi.poll();
        pi.forEach(x->System.out.println(x));

        //priority queue follows heap data structure

    }
}

class myCom implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2) return -1;
        if(o1<o2) return 1;
        return 0;
    }
}
