package loops;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int r,sum=0;
        int temp = num;
        while(num>0){
            r = num%10;
            sum = sum + r*r*r;
            num = num/10;
        }
        System.out.println("Sum = "+sum);
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
