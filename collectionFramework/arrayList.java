package collectionFramework;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> all1 = new ArrayList<>(20);
        ArrayList<Integer> all2 = new ArrayList<>(List.of(10,20,30,40,50));

        all1.add(10);
        all1.add(0, 20);
        all1.addAll(0,all2);

        // System.out.println(all1.contains(50));
        // // true and false on the basis of element is present or not
        // System.out.println(all1.get(5));
        // //give you the element at 5
        // System.out.println(all1);
        // // simply just print the array 
        // System.out.println(all1.indexOf(40));
        // // give index number if it exist in list otherwise -1
        // System.out.println(all1.lastIndexOf(50));
        // // gives last occurrence's index value
        // // replaceAll,retainAll,set,remove.removeAll and many methods of the arrayList
        // System.out.println(all1.set(4,100));
        // // set method replaces an existing object with a specified one

        // for(int i=0;i<all1.size();i++){
        //     System.out.println(all1.get(i));
        //     //it is an array list not an array so that accessing elements like a[i] is not possible here  
        // }

        // for (Integer integer : all2) {
        //     System.out.println(integer);
        // }

        // //var bhi use kr sakte h, object type nhi batana padega
        // for (var integer : all2) {
        //     System.out.println(integer);
        // }

        // //using iterator
        // for(Iterator<Integer> it = all1.iterator(); it.hasNext();){
        //     java.lang.Integer x = it.next();
        //     System.out.println(x);
        // }

        // //using lmbda expression
        // all1.forEach((x)->{
        //     System.out.println(x);
        // });


        // Iterator<Integer> it = all1.iterator();
         
        // ListIterator<Integer> it = all1.listIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        all1.forEach(n->System.out.println(n));

        // all1.forEach(System.out::println);

        // all1.forEach(n->show(n));
        
    }

    static void show(int n){
        if(n>30){
            System.out.println(n);
        }
    }
}
