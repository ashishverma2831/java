package methods;

import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        String greetName = greetWelcome(name);
        System.out.println(greetName);
        sc.close();
    }

    static String greetWelcome(String name){
        // for this you have to make returnType = void 
        // System.out.println("Welcome "+name);
        String str = "Welcome "+name;
        return str;
    }
}
