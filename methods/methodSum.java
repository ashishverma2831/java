package methods;

import java.util.Scanner;

public class methodSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter two numbers you want to add : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sumTwoNubers = sum2(num1,num2);
        System.out.println("Sum of two numbers is "+sumTwoNubers);
        sc.close();
    }

    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
}
