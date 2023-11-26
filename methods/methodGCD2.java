package methods;

import java.util.Scanner;

public class methodGCD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methodGCD2 gcd = new methodGCD2();
        System.out.println("Enter any numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcdNumbers = gcd.gcdOfTwoNumbers(a,b);
        System.out.println("The GCD of the numbers is "+gcdNumbers);
        sc.close();
    }

    int gcdOfTwoNumbers(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }
}
