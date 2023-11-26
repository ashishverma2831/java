package oops.constructor;

public class squareConstructor {
    public static void main(String[] args) {
        square s = new square(20);
        System.out.println(s.printArea());
    }
}
class square{
    int length;
    public square(){
        length=10;
    }
    public square(int l){
        length=l;
    }
    public int printArea(){
        return length*length;
    }
}
