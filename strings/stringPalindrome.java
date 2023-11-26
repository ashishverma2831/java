package strings;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check whether it's Palindrome or not :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String reverseString = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseString += str.charAt(i);
        }
        // System.out.println(str);
        // System.out.println(reverseString);
        if(str.equals(reverseString)){
            System.out.println("Entered string is Palindrome");
        }
        else{
            System.out.println("Entered string is not Palindrome");
        }
        sc.close();
    }
}
