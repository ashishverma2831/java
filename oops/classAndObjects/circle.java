package oops.classAndObjects;

import java.util.Scanner;

class circleR {
    public double radius;
    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
    public double circumferenceOfCircle(){
        return 2*Math.PI*radius;
    }
    public double perimeterOfCircle(){
        return circumferenceOfCircle();
    }
}

public class circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circleR circle = new circleR();
        System.out.println("Enter the radius of the circle : ");
        circle.radius = sc.nextDouble();

        System.out.println("The radius of the entered circle is "+circle.radius);
        System.out.println("The area of the circle is "+circle.areaOfCircle());
        System.out.println("The circumference/perimeter of the circle is "+circle.circumferenceOfCircle());
        // System.out.println("The value of the PI is "+Math.PI);
        sc.close();
    }
}
