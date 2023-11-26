package conditionalStatements;

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Entered number is neither positive nor negative.");
        }
        else if(num>0){
            System.out.println("Entered number is positive.");
        }
        else{
            System.out.println("Entered number is negative.");
        }

        sc.close();
    }
}
