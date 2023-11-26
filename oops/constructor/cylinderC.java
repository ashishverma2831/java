package oops.constructor;

import java.util.Scanner;

public class cylinderC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of the cylinder : ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        cylinder c1 = new cylinder(radius,height);
        // cylinder c1 = new cylinder();
        System.out.println("Height = "+c1.getHeight());
        System.out.println("Radius = "+c1.getRadius());
        System.out.println("Curved surface area = "+c1.getCurvedSurfaceArea());
        System.out.println("Total surface area = "+c1.getTotalSurfaceArea());
        System.out.println("Volume of cylinder = "+c1.getVolume());
        // c1.setRadius(5);
        // System.out.println(c1.getRadius());
        sc.close();
    }
}
class cylinder{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        if(r>=0){
            radius=r;
        }
        else{
            radius=0;
        }
    }
    public void setHeight(double h){
        if(h>=0){
            height=h;
        }
        else{
            height=0;
        }
    }
    public void setDimensions(double r,double h){
        setHeight(h);
        setRadius(r);
    }
    //constructor
    public cylinder(){
        // radius=1;
        // height=1;
        setHeight(1);
        setRadius(1);
    }
    public cylinder(double r,double h){
        setHeight(h);
        setRadius(r);
    }
    //constructor

    public double getCurvedSurfaceArea(){
        return 2*Math.PI*radius*height;
    }
    public double getTotalSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
}
