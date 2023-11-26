package methods;

import java.util.Scanner;

public class methodMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maximum = max(a,b);
        System.out.println("\nMaximum of the two is "+maximum);
        sc.close();
    }
    static int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}