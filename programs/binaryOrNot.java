import java.util.Scanner;

public class binaryOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        // if(str.matches("[01]*")){
        //     System.out.println("Entered string is binary string.");
        // }
        // else{
        //     System.out.println("Entered string is not binary string.");

        // }
        if(str.matches("[0-9A-F]*")){
            System.out.println("Entered string is hexadecimal string.");
        }
        else{
            System.out.println("Entered string is not hexadecimal string.");

        }
        sc.close();
    }
}
