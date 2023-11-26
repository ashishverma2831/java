package operators;

import java.util.Scanner;

public class arithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform the operation  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        float div = (float)a/b;

        // Addition
        System.out.println("The Addition of the two numbers is "+add);

        // Subtraction
        System.out.println("The Subtraction of the two numbers is "+sub);
      
        // Multiplication
        System.out.println("The Multiplication of the two numbers is "+mul);
     
        // Division
        System.out.println("The Division of the two numbers is "+div);
        sc.close();
    }
}
