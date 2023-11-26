package loops;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         System.out.printf("%2d",j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         System.out.printf("%2d",i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=i+1;j<=num+i;j++){
        //         System.out.printf("%4d",j);
        //     }
        //     System.out.println();
        // }

        for(int i=1,k=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.printf("%4d",k);
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
