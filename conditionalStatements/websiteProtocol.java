package conditionalStatements;

import java.util.Scanner;

public class websiteProtocol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website : ");
        String webUrl = sc.nextLine();
        String web2 = webUrl.substring(0, webUrl.indexOf(":"));
        if(web2.matches("https")){
            System.out.println("Hyper-text transfer protocol.");
        }
        else if(web2.matches("ftp")){
            System.out.println("File transfer protocol.");
        }
        String web3 = webUrl.substring( webUrl.lastIndexOf("."));
        if(web3.matches(".net")){
            System.out.println("Network.");
        }
        else if(web3.matches(".gov")){
            System.out.println("Government.");
        }
        else if(web3.matches(".com")){
            System.out.println("Commercial.");
        }
        else if(web3.matches(".org")){
            System.out.println("Organisational.");
        }
        else if(web3.matches(".biz")){
            System.out.println("Business.");
        }
        else{
            System.out.println("Invalid website.");
        }
        sc.close();
    }
}
