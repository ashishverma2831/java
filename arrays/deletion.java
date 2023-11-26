package arrays;

import java.util.Scanner;

public class deletion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        int n=7;
        arr[0]=21;
        arr[1]=35;
        arr[2]=42;
        arr[3]=67;
        arr[4]=98;
        arr[5]=89;
        arr[6]=68;
        System.out.println("Array before deletion : ");
        for(int x:arr){
            System.out.printf("%3d",x);
        }
        int z=0;
        System.out.println("\nEnter the element you want to delete :");
        int num = sc.nextInt();
        for(int k=0;k<7;k++){
            if(num==arr[k]){
                z=k;
            }
        }
        for(int i=z;i<n;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Element at position "+(z+1)+" is successfully deleted");

        System.out.println("Array after deletion : ");
        for(int y:arr){
            System.out.printf("%3d",y);
        }
        sc.close();
    }
}
