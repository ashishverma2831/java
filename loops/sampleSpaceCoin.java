package loops;

import java.util.Scanner;

public class sampleSpaceCoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins :");
        int coins = sc.nextInt();
        System.out.println("The number of sample spaces will be "+Math.round((Math.pow(2, coins))));

        // for(int i=1;i<=coins;i++){
        //     for(int j=1;j<=coins;j++){
        //         System.out.print("|"+i+","+j+"| ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
