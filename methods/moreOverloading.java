package methods;

import java.util.Scanner;

public class moreOverloading {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length and breadth of the rectangle :");
       double l=sc.nextDouble();
       double b=sc.nextDouble();

       double rectangleArea = area(l,b);
       System.out.println("The area of the rectangle is "+rectangleArea );

       System.out.println("Enter the radius of the circle : ");
       double r=sc.nextDouble();
       
       double circleArea = area(r);
       System.out.println("The area of the circle is "+circleArea);
       sc.close();
    }

    static double area(double l,double b){
        return l*b;
    }
    
    static double area(double r){
        return Math.PI*r*r;
    }
}
