package collectionFramework;

import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        
        ht.compute(1, (k,v)->v+"Z");

        System.out.println(ht);

    }
}
