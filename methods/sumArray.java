package methods;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
           array[i] = sc.nextInt();
        }
        System.out.println("The entered elements of the array are : ");
        for(int x:array){
            System.out.printf("%4d",x);
        }
        
        int sumOfTheArray = arraySum(array);
        System.out.println("\nThe sum of the elements of the array is "+sumOfTheArray);
        
        float averageArray = average(size, sumOfTheArray);
        System.out.println("The average of the elements of the array is "+averageArray);
     
        sc.close();
    }

    // sum of the elements of the array
    // static int arraySum(int arr[]){
    //     int sum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         sum += arr[i];
    //     }
    //     return sum;
    // }

    // using varargs(variable arguments)
    static int arraySum(int ...v){
        int sum = 0;
        for(int i=0;i<v.length;i++){
            sum += v[i];
        }
        return sum;
    }

    // average
    static float average(int size,int sum){
        float avg = (float)sum/size;
        return avg;
    }

}
