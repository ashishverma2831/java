package methods;

import java.util.Scanner;

public class methodCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***** ARITHMETIC OPERATIONS *****");
        System.out.println("        Addition-add");
        System.out.println("        Subtraction-sub");
        System.out.println("        Multiplication-mul");
        System.out.println("        Division-div");

        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the operation you want to apply : ");
        String operation  = sc.nextLine();

        switch(operation){
            case "add" : Add(a, b);
            break;
            case "sub" : Sub(a, b);
            break;
            case "mul" : Mul(a, b);
            break;
            case "div" : Div(a, b);
            break;
            default : System.out.println("Invalid Input");
        }
        
        // int addition = Add(a, b);
        // int subtraction = Sub(a,b);
        // int multiplication = Mul(a, b);
        // float division = Div(a, b);

        // System.out.println("The Addition of the two numbers is "+addition);
        // System.out.println("The Subtraction of the two numbers is "+subtraction);
        // System.out.println("The Multiplication of the two numbers is "+multiplication);
        // System.out.println("The Division of the two numbers is "+division);

        sc.close();
    }
    static void Add(int x,int y){
        int sum = x+y;
        System.out.println("The addition is "+sum);
    }
    static void Sub(int x,int y){
        int sub = x-y;
        System.out.println("The subtraction is "+sub);
    }
    static void Mul(int x,int y){
        int mul = x*y;
        System.out.println("The multiplication is "+mul);
    }
    static void Div(float x,float y){
        float div = x/y;
        System.out.println("The division is "+div);
    }
}
