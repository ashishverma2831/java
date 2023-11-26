package methods;

import java.util.Scanner;

public class methodSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = sc.nextInt(); // a=4
        int b = sc.nextInt();// b=5
        System.out.println("Before swapping :"+a+","+b);
        // System.out.print(a + "," +b); // 4,5
        swap(a,b);
        // System.out.println("After swapping :");
        // System.out.println(a + "," + b);
        sc.close();
    }
    static void swap(int x,int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping : "+x+","+y);
    }
}
