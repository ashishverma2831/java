package twoDArrays;

import java.util.Scanner;

public class initialising2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        int array[][] = new int[rows][columns];
        System.out.println("Array before initialization :");

        // rows = array.length
        // columns = array[0].length

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("%2d",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the elements of the array : ");
        for(int m=0;m<rows;m++){
            for(int n=0;n<columns;n++){
                System.out.println("Array["+(m+1)+"]["+(n+1)+"]"+" = ");
                array[m][n] = sc.nextInt();
            }
        }
        System.out.println("Array after initialization :");

        // iterating using for-each loop

         for(int x[]:array){
            for(int y:x){
                System.out.printf("%2d",y);
            }
            System.out.println();
         }
        sc.close();
    }
}
