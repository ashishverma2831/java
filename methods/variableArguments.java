package methods;

import java.util.Scanner;

public class variableArguments {
    public static void main(String[] args) {
        // varags(12,23,4,56,7);
        // int varIntSum = varagsSum(1,2,3,4,5,6,7,8,9,10);
        // System.out.println(varIntSum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add : ");
        int size = sc.nextInt();

        int varArray[] = new int[size];
        System.out.println("Enter the elements you want to add : ");
        for(int i=0;i<varArray.length;i++){
            varArray[i] = sc.nextInt();
        }
        varagsSum(new int[]{1,2,3,4,5,6,7,});
        int varSumArray = varagsSum(varArray);
        System.out.println("The sum of the input numbers is "+varSumArray);
        sc.nextLine();

        // System.out.println("String array into list : ");
        // showList("ashish","arun","kashish","amit");

        sc.close(); 
    }

    // static void varags(int ...x){
    //     for (int i : x) {
    //         System.out.println(i);
    //     }
    // }

    static int varagsSum(int ...x){
        int sum = 0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }

    static void showList(String ...x){
        for(int i=0;i<x.length;i++){
            System.out.println((i+1)+". "+x[i]);
        }
    }
}

