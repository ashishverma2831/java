package conditionalStatements;

import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Your grades are A+.");
        }
        else if(marks<90 && marks>=80){
            System.out.println("You get B grade.");
        }
        else if(marks<80 && marks>=70){
            System.out.println("You get C grade.");
        }
        else if(marks<70 && marks>=60){
            System.out.println("You get D grade.");
        }
        else if(marks>100){
            System.out.println("Invalid Marks");
        }
        else{
            System.out.println("You get E as grades.");
        }
        sc.close();
    }
}
