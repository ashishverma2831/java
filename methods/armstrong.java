package methods;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number : ");
        // int number = sc.nextInt();

        // if(checkArmstrong(number)==true){
        //     System.out.println("Armstrong number ");
        // }
        // else{
        //     System.out.println("Not an armstrong number ");
        // }

        for(int i=100;i<=1000;i++){
            if(checkArmstrong(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }

    // counting number of digits

    // static int countDigit(int num){
    //     int count = 0;
    //     while(num>0){
    //         count++;
    //         num = num/10;
    //     }
    //     return count;
    // }

    static boolean checkArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num>0){
            int remainder = num%10;
            sum = sum + remainder*remainder*remainder;
            num = num/10;
        }
        if(original==sum)
            return true;
        return false;
        // if(original==sum){
        //     System.out.println("Armstrong");
        // }
        // else{
        //     System.out.println("Not Armstrong");
        // }
    }
}
