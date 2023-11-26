package conditionalStatements;

import java.util.Scanner;

public class web {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website URL : ");
        String str = sc.nextLine();
        // String str = "www.udemy.com";
        String webStr = str.substring(str.lastIndexOf(".")+1);
        switch(webStr){
            case "com" : System.out.println("Commercial");
            break;
            case "net" : System.out.println("Network");
            break;
            case "gov" : System.out.println("Governmental");
            break;
            case "org" : System.out.println("Organisational");
            break;
            case "biz" : System.out.println("Business");
            break;
            default: System.out.println("Invalid weebsite");
        }

        // if(webStr.matches("net")){
        //     System.out.println("Network.");
        // }
        // else if(webStr.matches("gov")){
        //     System.out.println("Government.");
        // }
        // else if(webStr.matches("com")){
        //     System.out.println("Commercial.");
        // }
        // else if(webStr.matches("org")){
        //     System.out.println("Organisational.");
        // }
        // else if(webStr.matches("biz")){
        //     System.out.println("Business.");
        // }
        // else{
        //     System.out.println("Invalid website.");
        // }


        sc.close();
    }
}
