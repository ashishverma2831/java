package twoDArrays;

import java.util.Scanner;

public class arrayMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the Array A :");
        int rowsA = sc.nextInt();
        int columnsA = sc.nextInt();
        System.out.println("Enter the rows and columns of the array B :");
        int rowsB = sc.nextInt();
        int columnsB = sc.nextInt();

        int arrayC[][] = new int[rowsA][columnsB];

        int arrayA[][] = new int[rowsA][columnsA];
        int arrayB[][] = new int[rowsB][columnsB];

        if(columnsA != rowsB){
            System.out.println("Multiplication is not possible because of the orders of the given arrays are not proper.");
            System.exit(0);
        }

        System.out.println("Enter the elements of the array A: ");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<columnsA;j++){
                arrayA[i][j] = sc.nextInt();
            }
        }   
        for(int x[]:arrayA){
            for(int y:x){
                System.out.printf("%4d",y);
            }
            System.out.println();
        }

        System.out.println("Enter the elements of the array B : ");
        for(int i=0;i<rowsB;i++){
            for(int j=0;j<columnsB;j++){
                arrayB[i][j] = sc.nextInt();
            }
        }
        for(int x[]:arrayB){
            for(int y:x){
                System.out.printf("%4d",y);
            }
            System.out.println();
        }
        System.out.println("Order of the Multiplication array is "+rowsA+" X "+columnsB+".");
        System.out.println("Multiplication of the array A and array B is :");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<columnsB;j++){
                for(int k=0;k<columnsA;k++){
                    arrayC[i][j] += arrayA[i][k]*arrayB[k][j];
                    // arrayC[i][j] = arrayC[i][j] + arrayA[i][k]*arrayB[k][j];
                }
            }
        }

        for(int x[]:arrayC){
            for(int y:x){
                System.out.printf("%4d",y);
            }
            System.out.println();
        }

        sc.close();
    }
}
