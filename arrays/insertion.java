package arrays;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int arr[] = {12,34,56,78,43,51,23};
        int arr[] = new int[10];
        int n=7; // number of elements in the array
        arr[0] = 12;
        arr[1] = 34;
        arr[2] = 56;
        arr[3] = 78;
        arr[4] = 43;
        arr[5] = 51;
        arr[6] = 23;
        System.out.println("Array before insertion : ");
        for(int x:arr){
            System.out.printf("%4d",x);
        }

        System.out.println("\nEnter the element you want to insert :");
        int num = sc.nextInt();
        System.out.println("Position of the new element : ");
        int x = sc.nextInt();

        for(int i=n;i>=x-1;i--){
            arr[i] = arr[i-1];
        }
        arr[x-1] = num;
        System.out.println("Array after insertion : ");
        for(int y:arr){
            System.out.printf("%4d",y);
        }
        sc.close();
    }
}
