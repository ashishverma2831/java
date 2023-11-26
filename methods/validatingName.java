package methods;

import java.util.Scanner;

public class validatingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        if(isValidName(name)){
            System.out.println("Enterd name is a valid name.");
        }
        else{
            System.out.println("Entered name must not contain digits and special characters.");
        }
        sc.close();
    }

    static boolean isValidName(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
}
