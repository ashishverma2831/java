package oops.inheritance;

public class methodOverriding {
    public static void main(String[] args) {
        superClass SC = new superClass();
        SC.display();

        subClass sc = new subClass();
        sc.display();

        // dynamic dispatch
        superClass sup = new subClass();
        sup.display();

    }
}
class superClass{
    public void display(){
        System.out.println("Hello");
    }
}
class subClass extends superClass{
    // @Override
    public void display(){
        System.out.println("Hello World");
    }
}