package loops;

import java.util.Scanner;

public class sumUptoN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number till you want the sum : ");
        // int num = sc.nextInt();
        // int sum = 0;
        // for(int i=1;i<=num;i++){
        //     sum += i;
        // }

        // for(int i=1;i<=num;i++){
        //     sum += i;
        //     System.out.print(i+" + ");
        // } 

        int summation = Sum(2,4,5,12,56);
        System.out.println(summation);
        // System.out.println("\nThe summation till "+num+" numbers = "+sum);
        sc.close();
    }
    public static int Sum(int ...x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }
}
