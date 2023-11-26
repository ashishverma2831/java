package methods;

import java.util.Scanner;

public class methodReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int reversedNumber = reverse(num);
        System.out.println("The reversed number of the entered number is "+reversedNumber);
        
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int copiedArray[] = reverseArray(array);

        System.out.println("The reversed array is : ");
        for (int i : copiedArray) {
            System.out.print(i+" ");
        }
        sc.close();
    }

    static int reverse(int number){
        int sum=0;
        while(number>0){
        int remainder = number%10;
        sum = sum*10 + remainder;
        number = number/10;
        }
        return sum;
    }

    static int[] reverseArray(int A[]){
        int B[] = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j] = A[i];
        }
        return B;
    }
}
