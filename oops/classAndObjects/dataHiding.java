package oops.classAndObjects;

import java.util.Scanner;

public class dataHiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangleR rect = new rectangleR();
        System.out.println("Enter length and breadth of the rectangle : ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        rect.setLength(length);
        rect.setBreadth(breadth);
        System.out.println("Length is "+rect.getLength());
        System.out.println("Breadth is "+rect.getBreadth());
        System.out.println("Area is "+rect.getArea());
        System.out.println("Perimeter of the rectangle is "+rect.getPerimeter());
        
        if(rect.isSquare(length,breadth)){
            System.out.println("Yes, it is a square");
        }
        else{
            System.out.println("No, it is not a square");
        }
        sc.close();
    }
}

class rectangleR {
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public void setLength(double l){
        if(l>=0){
            length=l;
        }
        else{
            length=0;
        }
    }

    public double getBreadth(){
        return breadth;
    }
    public void setBreadth(double b){
        if(b>=0){
            breadth=b; 
        }
        else{
            breadth=0;
        }
    }
    public double getArea(){
        return getLength()*getBreadth();
    }
    public double getPerimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(double length,double breadth){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
