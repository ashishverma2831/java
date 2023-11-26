package strings;
 
import java.util.Scanner;

public class substring{
	
    static void printSubstrings(String input) {
        // Write your code here
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                System.out.println(input.substring(i,j));
            }
            System.out.println();
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
        sc.close();
	}
}
