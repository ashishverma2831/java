import java.util.Scanner;

public class gcdOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        int dividend,divisor,remainder;
        if(num_1>num_2){
            dividend = num_1;
            divisor = num_2;
        }
        else{
            dividend = num_2;
            divisor = num_1;
        }

        while(divisor>0){
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        } 

        System.out.println("The GCD of "+num_1+" and "+num_2+" is "+dividend);
        sc.close();
    }
}
