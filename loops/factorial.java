package loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        // int fact = sc.nextInt();
        // if(fact==0||fact==1){
        //     System.out.println("Factorial of the entered number is 1");
        // }
        // else if(fact>1){
        //     for(int i=fact-1;i>=1;i--){
        //       fact = fact*i;
        //     }
        //     System.out.println("Factorial of the entered number is "+fact);
        // }
        // else{
        //     System.out.println("Enter any valid or positive number.");
        // }

        
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of the entered number is "+fact);
        sc.close();

    }
}
