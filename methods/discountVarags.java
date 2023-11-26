package methods;

import java.util.Scanner;

public class discountVarags {
    public static void main(String[] args) {

        // galat h program

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total money : ");
        double totalMoney = sc.nextDouble();
        double discount = discount(totalMoney);
        System.out.println("Your total money after discount will be "+discount);
        sc.close();
    }

    static double discount(double money){
        double price=money;
        if(price>500 && price<=1000){
            price = price*(10/100);
            return price;
        }
        else if(price>1000 && price<=2000){
            price = price*(20/100);
            return price;
        }
        else if(price>2000){
            price = price*(30/100);
            return price;
        }
        else{
            System.out.println("No discount");
            return price;
        }
    }
}
