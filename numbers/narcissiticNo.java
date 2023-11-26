package numbers;

import java.util.Scanner;

public class narcissiticNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int number = num;
        int final_number = num;
        int count=0;
        double sum = 0,r;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("The length of given number is "+count);
        sc.close();
        while(number>0){
            r = number%10;
            sum = sum + Math.pow(r, count);
            number = number/10;
        }
        System.out.println("Sum = "+sum);
        if(final_number==sum){
            System.out.println("Entered number is Narcissitic number.");
        }
        else{
            System.out.println("Entered number is not narcissitic number.");
        }
    }
}
