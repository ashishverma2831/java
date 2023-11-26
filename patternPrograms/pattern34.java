package patternPrograms;

import java.util.Scanner;

public class pattern34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want :");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
