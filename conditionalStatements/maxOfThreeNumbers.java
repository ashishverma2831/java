package conditionalStatements;
import java.util.Scanner;

public class maxOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        if(a>b && a>c){
            System.out.println("The largest of the three numbers is "+a);
        }
        else if(b>c){
            System.out.println("The largest of the three numbers is "+b);
        }
        else{
            System.out.println("The largest of the three numbers is "+c);
        }
        sc.close();
    }
}
