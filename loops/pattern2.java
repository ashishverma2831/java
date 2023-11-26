package loops;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     int k=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.printf("%2d",k);
        //         k++;
        //     }
        //     System.out.println();
        // }

        // int k=1;
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.printf("%4d",k);
        //         k++;
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=num;i++){
            int k=1;
            for(int j=1;j<=num+1-i;j++){
                System.out.printf("%2d",k);
                k++;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
