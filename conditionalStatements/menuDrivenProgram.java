package conditionalStatements;

import java.util.Scanner;

public class menuDrivenProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("+*+*+");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("MOD");
        System.out.println("+*+*+");
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation you want to apply:");
        String str = sc.nextLine();
        switch(str){
            case "ADD": System.out.println("Summation of two numbers is: "+(a+b));
            break;
            case "SUB": System.out.println("Subtraction of two numbers is: "+(a-b));
            break;
            case "MUL": System.out.println("Multiplication of two numbers is: "+(a*b));
            break;
            case "DIV": System.out.println("Division of two numbers is: "+(a/b));
            break;
            case "MOD": System.out.println("Modulus of two numbers is: "+(a%b));
            break;
            default: System.out.println("Invalid operation");
        }
        System.out.println("______THANKYOU______");
        sc.close();
    }
}
