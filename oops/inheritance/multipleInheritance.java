package oops.inheritance;

// there is no multiple inheritance in java 
// only interface
public class multipleInheritance {
    public static void main(String[] args) {
        test t = new test();
        t.displayOne();
        t.displayTwo();
        t.displayThree();
    }
}
interface oneO{
    void displayOne();
}
interface twoT{
    void displayTwo();
}
interface threeTH extends oneO,twoT{
    void displayThree();
}

class test implements threeTH{
    @Override
    public void displayOne(){
        System.out.println("One");
    }
    public void displayTwo(){
        System.out.println("Two");
    }
    public void displayThree(){
        System.out.println("Three");
    }
}


