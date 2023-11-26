package oops.classAndObjects;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangleLB rect_1 = new rectangleLB();
        System.out.println("Enter the length of the rectangle_1 : ");
        rect_1.length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle_1 : ");
        rect_1.breadth = sc.nextDouble();

        rectangleLB rect_2 = new rectangleLB();
        System.out.println("Enter the length of the rectangle_2 : ");
        rect_2.length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle_2 : ");
        rect_2.breadth = sc.nextDouble();

        System.out.println("The area of the rectangle_1 is "+rect_1.rectangleArea());
        System.out.println("The perimeter of the rectangle_1 is "+rect_1.rectanglePerimeter());

        
        System.out.println("The area of the 2 is "+rect_2.rectangleArea());
        System.out.println("The perimeter of the rectangle_2 is "+rect_2.rectanglePerimeter());

        System.out.println("Is rectangle_1 a square : "+rect_1.isSquare());
        System.out.println("Is rectangle_2 a square : "+rect_2.isSquare());

        sc.close();
    }
}

class rectangleLB{
    public double length;
    public double breadth;

    public double rectangleArea() {
        return length*breadth;
    }

    public double rectanglePerimeter() {
        return 2*(length+breadth);
    }

    public boolean isSquare() {
        if(length==breadth)
            return true;
        else
            return false;
    }
}