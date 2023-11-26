package numbers;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int num = sc.nextInt();
        int flag=0;
        if(num==0 || num==1){
            System.out.println("Entered number is not prime number.");
        }
        else{
            for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Entered number is not prime number.");
        }
        else{
            System.out.println("Entered number is prime number.");
        }
        sc.close();
    }
    }
}
