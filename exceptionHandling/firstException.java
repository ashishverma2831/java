package exceptionHandling;

import java.util.Scanner;

public class firstException {
    public static void main(String[] args) {
        // try{
        //     int a=10;
        //     int b=0;
        //     int c=a/b;
        //     System.out.println(c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Error, Not possible \n"+e);
        // }

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            c=a/b;
            System.out.println("Division is "+c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero, indefinite");
            System.out.println("Try again, Goodluck next time");
        }
        System.out.println("Byeee");
        sc.close();
    }
}

// e is like a parameter