package oops.inheritance;

public class circleCylinder {
    public static void main(String[] args) {
        // circle circleC1 = new circle();
        cylinder cylinderC1 = new cylinder();
        cylinderC1.radius = 10;
        cylinderC1.height = 10;
        System.out.println("The volume of the cylinder is "+cylinderC1.cylinderVolume());
    }
}
class circle{
    public double radius;
    public double circleArea(){
        return Math.PI*radius*radius;
    }
    public double circleCircumference(){
        return 2*Math.PI*radius;
    }
    public double circlePerimeter(){
        return circleCircumference();
    }
    public double circleDiameter(){
        return 2*radius;
    }
}
class cylinder extends circle{
    public double height;
    public double cylinderVolume(){
        return circleCircumference()*height;
    }
}