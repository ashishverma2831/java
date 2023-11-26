package patternPrograms;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides of the square: ");
        int side = sc.nextInt();
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
