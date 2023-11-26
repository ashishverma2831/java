package numbers;

import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int temp = num;
        int r;
        int sum = 0;
        while(num>0){
            r = num%10;
            sum = sum + r*r*r;
            num = num/10;
        }
        System.out.println("Sum is "+sum);
        if(temp==sum){
            System.out.println("Entered number is Armstrong number.");
        }
        else{
            System.out.println("Entered number is not Armstrong number.");
        }
        sc.close();
    }
}
