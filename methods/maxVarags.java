package methods;

import java.util.Scanner;

public class maxVarags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want ? ");
        int num = sc.nextInt();

        int array[] = new int[num];
        System.out.println("Enter the numbers :");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The entered array is : ");
        for (int i : array) {
            System.out.printf("%4d",i);
        }

        int maxArray = max(array);
        System.out.println("\nThe maximum of the array is "+maxArray);
        sc.close();
    }

    static int max(int ...x){
        int maximum = x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>maximum){
                maximum = x[i];
            }
        }
        return maximum;
    }
        
}
