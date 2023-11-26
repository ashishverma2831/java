package methods;

import java.util.Scanner;

public class recursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int factorialNum = factorial(num);
        System.out.println("The factorial of the entered number is "+factorialNum);
        sc.close();
    }

    static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            num = num*factorial(num-1);
        }
        return num;
    }
}
