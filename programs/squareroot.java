import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        double num = sc.nextFloat();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of the entered number is : "+squareRoot);
        sc.close();
    }
}
