package loops;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want the sequence :");
        int num = sc.nextInt();
        int a=0,b=1;
        int c=0;
        if(num==1){
            System.out.println(a);
        }
        else if(num==2){
            System.out.println(a+","+b);
        }
        else if(num>2){
            System.out.print(a+","+b);
            for(int i=3;i<=num;i++){
                c=a+b;
                System.out.print(","+c);
                a=b;
                b=c;
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
