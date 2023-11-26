package exceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class fileInput {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Yup");
        }
    }

    static void divide() {
        try (FileInputStream fi = new FileInputStream("/Users/HP/Desktop/mine.txt");Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a+" "+b);

            System.out.println(a/c);
            // int g = sc.nextInt();
            // System.out.println(g);

        } catch (Exception e) { 
            System.out.println(e);
            System.out.println("Hii");
        }
    }
}
