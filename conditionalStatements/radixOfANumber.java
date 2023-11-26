package conditionalStatements;

import java.util.Scanner;

public class radixOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        String num = sc.nextLine();
        if(num.matches("[01]*")){
            System.out.println("The radix of the number is 2, it's a Binary number.");
        }
        else if(num.matches("[0-7]*")){
            System.out.println("The radix of the number is 8, it's a Octal number.");
        }
        else if(num.matches("[0-9]*")){
            System.out.println("The radix of the number is 10, it's a Decimal number.");
        }
        else if(num.matches("[0-9A-Fa-f]*")){
            System.out.println("The radix of the number is 16, it's a Hexa-decimal number.");
        }
        else{
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
