import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping:"+a+" "+b);
        a = a^b;
        b = a^b;   // bitwise xor operator
        a = a^b;
        System.out.println("After Swapping:"+a+" "+b);
        sc.close();
    }
}
