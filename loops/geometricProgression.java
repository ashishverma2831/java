package loops;

import java.util.Scanner;

public class geometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term :");
        int a = sc.nextInt();
        System.out.println("Enter the value of r :");
        int r = sc.nextInt();
        System.out.println("Enter the number of terms you want in the sequence :");
        int num = sc.nextInt();
         
        // displaying geometric progression
        // 3,9,27,81
        int term = a;
        for(int i=1;i<=num;i++){
            System.out.print(term+",");
            term = term*r;
        }
        sc.close();
    }
}
