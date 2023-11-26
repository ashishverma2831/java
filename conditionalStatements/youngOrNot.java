package conditionalStatements;

import java.util.Scanner;

public class youngOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("The person is Young and Passionate.");
        // }
        // else if(age==0){
        //     System.out.println("The person is not born yet. ");
        // }
        // else{
        //     System.out.println("You're still a child.");
        // }
        if(age>=14 && age<=55){
            System.out.println("The person is young.");
        }
        else if(age<14 || age>55){
            System.out.println("The person is not young.");
        }
        else{
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
