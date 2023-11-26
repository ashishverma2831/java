package patternPrograms;

import java.util.Scanner;

public class diamondD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in diamond pattern : ");
        int rows = sc.nextInt();
        printDiamond(rows); 

        // for (int i=1;i<=5;i++) {
        //     for (int j=1;j<=5;j++) {
        //         if(j>=6-i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for (int j=1;j<=5;j++) {
        //         if(j<i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i=1;i<=5;i++) {
        //     for (int j=1;j<=5;j++) {
        //         if(j>i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for (int j=1;j<5;j++) {
        //         if(j<5-i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i=1;i<=5;i++) {
        //     for (int j=1;j<=5;j++) {
        //         if(j<i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        sc.close();
    }

    public static void printDiamond(int num){
        for (int i=1;i<=num;i++) {
            for (int j=1;j<=num;j++) {
                if(j>=num+1-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j=1;j<=num;j++) {
                if(j<i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i=1;i<=num;i++) {
            for (int j=1;j<=num;j++) {
                if(j>i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j=1;j<num;j++) {
                if(j<num-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
