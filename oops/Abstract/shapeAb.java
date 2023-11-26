package oops.Abstract;

public class shapeAb {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.length=5;
        r.breadth=8;

        shape s;
        s=r;    // shapeAb s=r;
        
        System.out.println(s.perimeter());
    }
}

abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    double length;
    double breadth;
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}