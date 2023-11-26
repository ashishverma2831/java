package oops.constructor;

public class rectangleR {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        System.out.println("Area is "+rect.getArea()); 
        System.out.println("Perimeter is "+rect.getPerimeter());    
    }
}

class rectangle{
    private double length;
    private double breadth;
//constructor
    public rectangle(){
        length=1;
        breadth=1;
        // setBreadth(1);
        // setLength(1);
    }
    public rectangle(double l,double b){
        setLength(l);
        setBreadth(b);
    }
//constructor
    public rectangle(double s){
        length=breadth=s;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>=0){
            length=l;
        }
        else{
            length=0;
        }
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
}