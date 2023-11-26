package twoDArrays;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayD[][] = new int[4][];
        arrayD[0] = new int[4];
        arrayD[1] = new int[8];
        arrayD[2] = new int[2];
        arrayD[3] = new int[6];
        System.out.println("\nThe length of the Jagged array is "+arrayD.length);
        System.out.println("\nRepresentation of Jagged array : ");
        for(int j=0;j<arrayD.length;j++){
            for(int k=0;k<arrayD[j].length;k++){
                // System.out.printf("%2d",arrayD[j][k]);
                arrayD[j][k]=sc.nextInt();
            }
            System.out.println();
        }
        // for(int j=0;j<arrayD.length;j++){
        //     for(int k=0;k<arrayD[j].length;k++){
        //         System.out.printf("%2d",arrayD[j][k]);
        //     }
        //     System.out.println();
        // }

        // jagged array in 2D array
        
        for (int[] i : arrayD) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
