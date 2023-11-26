import java.util.Scanner;

public class binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        System.out.println("Entered number is "+num);
        sc.close();
    }
}
