package oops.classAndObjects;

import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cylinderRH cylinder = new cylinderRH();
        System.out.println("Enter the radius of the cyliner : ");
        cylinder.radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        cylinder.height = sc.nextDouble();

        System.out.println("The curved area of the cylinder is : "+cylinder.curvedSurfaceAreaOfCylinder());
        System.out.println("The total surface area of the cylinder is : "+ cylinder.totalSurfaceAreaOfCylinder());
        System.out.println("The volume of the cylinder is : "+cylinder.volumeOfCylinder());
        System.out.println("The lid area of the cylinder is : "+cylinder.lidArea());
        sc.close();
    }
}

class cylinderRH {
    public double radius;
    public double height;

    public double curvedSurfaceAreaOfCylinder() {
        return 2*Math.PI*radius*height;
    }

    public double totalSurfaceAreaOfCylinder() {
        return 2*Math.PI*radius*(radius+height);
    }

    public double volumeOfCylinder() {
        return Math.PI*radius*radius*height;
    }

    public double lidArea() {
        return Math.PI*radius*radius;
    }
}