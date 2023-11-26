package oops.inheritance;

public class singleInheritance {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        Sub sc = new Sub();
        sc.display();
        sc.displayD();
    }
}

class Super{
    public void display(){
        System.out.println("Super class is here");
    }
}
class Sub extends Super{
    public void displayD(){
        System.out.println("Sub class is here");
    }
}