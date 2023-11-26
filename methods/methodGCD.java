package methods;

import java.util.Scanner;

public class methodGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
         
        int gcd = gcdOfTwoNumbers(a,b);
        System.out.println("GCD of the entered numbers is "+gcd);
        sc.close();
    }

    static int gcdOfTwoNumbers(int x,int y){
        // int max=0;
        // while(x!=y){
        //     max = x>y?x:y;
        //     if(x==max){
        //         x=max-y;
        //     }
        //     else{
        //         y = max-x;
        //     }
        // }
        while(x!=y){
          if(x>y)
            x=x-y;  
          else
            y=y-x;
        }
        return x;
        // return y;
    }
}
