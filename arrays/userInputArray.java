package arrays;

import java.util.Scanner;

public class userInputArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        System.out.println("Enter the elements of the array : ");
        
        // user input
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        // changing value 
        array[4]=28; 
        array[7]=78;

        // printing array
        for(int x:array){
            System.out.printf("%3d",x);
        }
        sc.close();
    }
}
