package conditionalStatements;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any english capital alphabet : ");
        String alpha = sc.nextLine();
        switch(alpha){
            case "A": System.out.println("Apple");
            break;
            case "B": System.out.println("Ball");
            break;
            case "C": System.out.println("Cat");
            break;
            case "D": System.out.println("Dog");
            break;
            case "E": System.out.println("Elephant");
            break;
            case "F": System.out.println("Flower");
            break;
            case "G": System.out.println("Goat");
            break;
            case "H": System.out.println("Hollow");
            break;
            case "I": System.out.println("Influenza");
            break;
            case "J": System.out.println("Jaguar");
            break;
            case "K": System.out.println("Kite");
            break;
            case "L": System.out.println("Lion");
            break;
            case "M": System.out.println("Monkey");
            break;
            case "N": System.out.println("Neon");
            break;
            case "O": System.out.println("Orange");
            break;
            case "P": System.out.println("Purple");
            break;
            case "Q": System.out.println("Quit");
            break;
            case "R": System.out.println("Riya");
            break;
            case "S": System.out.println("Salon");
            break;
            case "T": System.out.println("Torando");
            break;
            case "U": System.out.println("Union");
            break;
            case "V": System.out.println("Violet");
            break;
            case "W": System.out.println("Wings");
            break;
            case "X": System.out.println("Xenon");
            break;
            case "Y": System.out.println("Yellow");
            break;
            case "Z": System.out.println("Zendaya");
            break;
            default : System.out.println("Invalid Alphabet");
            }
        sc.close();
    }
}
