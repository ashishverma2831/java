package collectionFramework;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20, 0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(50);
        hs.add(5);
        hs.add(20);
        hs.add(10);

        System.out.println(hs);

    }
}
