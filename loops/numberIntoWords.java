package loops;

import java.util.Scanner;

public class numberIntoWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        // reversing the number
        // int r,sum=0;
        // while(num>0){
        //     r = num%10;
        //     sum = sum*10 + r;
        //     num = num/10;
        // }
        // System.out.println("Displaying number into words:");

        // int numWords;
        // while(sum>0){
        //     numWords = sum%10;
        //     switch(numWords){
        //         case 0:System.out.print("Zero ");
        //         break;
        //         case 1:System.out.print("One ");
        //         break;
        //         case 2:System.out.print("Two ");
        //         break;
        //         case 3:System.out.print("Three ");
        //         break;
        //         case 4:System.out.print("Four ");
        //         break;
        //         case 5:System.out.print("Five ");
        //         break;
        //         case 6:System.out.print("Six ");
        //         break;
        //         case 7:System.out.print("Seven ");
        //         break;
        //         case 8:System.out.print("Eight ");
        //         break;
        //         case 9:System.out.print("Nine ");
        //         break;
        //         default:System.out.println("***** ");
        //         break;
        //     }
        // sum = sum/10;
        // }

        // displaying numbers into words with tailing zero

        int r;
        String str = "";
        while(num>0){
            r = num%10;
            str = str + r;
            num = num/10;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--){
            c = str.charAt(i);
            switch(c){
                case '0':System.out.print("Zero ");
                break;
                case '1':System.out.print("One ");
                break;
                case '2':System.out.print("Two ");
                break;
                case '3':System.out.print("Three ");
                break;
                case '4':System.out.print("Four ");
                break;
                case '5':System.out.print("Five ");
                break;
                case '6':System.out.print("Six ");
                break;
                case '7':System.out.print("Seven ");
                break;
                case '8':System.out.print("Eight ");
                break;
                case '9':System.out.print("Nine ");
                break;
                default:System.out.println("***** ");
                break;
            }
        }
        sc.close();

    }
}
