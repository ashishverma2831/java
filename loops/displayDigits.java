package loops;

import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int r;
        while(num>0){
            r = num%10;
            System.out.printf("%2d",r);
            num = num/10;
        }
        sc.close();
    }
}
