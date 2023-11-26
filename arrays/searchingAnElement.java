package arrays;

import java.util.Scanner;

public class searchingAnElement {
    public static void main(String[] args){
        int array[] = {23,45,67,38,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int num = sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                System.out.println("The Element is found at "+(i+1));
                System.exit(0); //break
            }
        }
        System.out.println("The element is not in the given array");
        sc.close();
    }
}
