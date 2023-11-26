package strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        
        // reversing a string
        for(int i=0;i<str.length();i++){
            int j=str.length()-i-1;
            System.out.print(str.charAt(j));
        }

        // System.out.println(str);

        sc.close();
    }
}
