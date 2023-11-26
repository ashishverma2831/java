package loops;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int r,sum=0;
        while(num>0){
            r = num%10;
            sum = sum*10 + r;
            num = num/10;
        }
        System.out.println("The reverse of the entered number is :"+sum);
        sc.close();
    }
}
