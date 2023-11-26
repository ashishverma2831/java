package numbers;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int r;
        int sum=0;
        int temp=num;
        while(num>0){
            r = num%10;
            sum = sum*10 + r;
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Entered number is palindrome number.");
        }
        else{
            System.out.println("Entered number is not palindrome.");
        }
        sc.close();
    }
}
