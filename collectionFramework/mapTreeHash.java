package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class mapTreeHash {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B"));
        tm.put(3,"C");

        System.out.println(tm);
        System.out.println(tm.get(3));

    }
}
