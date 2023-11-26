package loops;

import java.util.Scanner;

public class arithmeticProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic Progression");
        System.out.println("Enter the value of the first term : ");
        int a = sc.nextInt();
        System.out.println("Enter the difference value :");
        int d = sc.nextInt();
        System.out.println("First term \'a\' is "+a);
        System.out.println("Difference \'d\' is "+d);
        // System.out.println("Find the nthTerm of the sequence : ");
        // int n = sc.nextInt();
        // int nthTerm = a + (n-1)*d;
        // System.out.println(n+"thTerm of the sequence is "+nthTerm);
        
        // displaying the sequence 
        System.out.println("Enter the number till you want the sequence :");
        int num =sc.nextInt();
        // int nthTerm;
        // for(int i=1;i<=num;i++){
        //     nthTerm = a + (i-1)*d;
        //     System.out.print(nthTerm+",");
        // }
        for(int i=0;i<num;i++)
        {
            System.out.print(a+",");
            a=a+d;
        } 
        sc.close();
    }
}
