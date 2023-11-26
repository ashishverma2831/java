import java.util.Scanner;

public class odd_even_checker{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = s.nextInt();
        if(num%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");

        }
        s.close();
    }
}