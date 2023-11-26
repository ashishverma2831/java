package oops.inheritance;

public class rectCuboid {
    public static void main(String[] args) {
        cuboid c = new cuboid(10,20,4);
        System.out.println(c.cuboidVolume());   
    }
}

class rectangleR{
    int length;
    int breadth;
    public rectangleR(){
        length=1;
        breadth=1;
    }
    public rectangleR(int x,int y){
        length=x;
        breadth=y;
    }
}

class cuboid extends rectangleR{
    int height;
    public cuboid(){
        height = 1;
    }
    public cuboid(int h){
        height = h;
    }
    public cuboid(int l,int b,int h){
        super(l,b);
        height = h;
    }
    public int cuboidVolume(){
        return length*breadth*height;
    }
}