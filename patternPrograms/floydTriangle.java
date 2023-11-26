package patternPrograms;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        // int n=15;
        // int k=1;
        // for(int i=0;i<=5;i++){
        //     // int k=1;
        //     for(int j=0;j<i;j++){
        //         System.out.print(" "+k);
        //         k++;
        //     }
        //     System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the k and No. of Rows : ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            // int k=1;
            for(int j=0;j<i;j++){
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}

