package conditionalStatements;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Entered number is even.");
        }
        else{
            System.out.println("Entered number is odd.");
        }
        sc.close();
    }
}
