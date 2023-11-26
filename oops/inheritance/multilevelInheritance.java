package oops.inheritance;

public class multilevelInheritance {
    public static void main(String[] args) {
        one one1 = new one();
        one1.displayOne();

        two two1 = new two();
        two1.displayOne();
        two1.displayTwo();

        three three1 = new three();
        three1.displayOne();
        three1.displayTwo();
        three1.displayThree();
    }
}

class one{
    void displayOne(){
        System.out.println("Display one is here");
    }
}
class two extends one{
    void displayTwo(){
        System.out.println("Display two is here");
    }
}
class three extends two{
    void displayThree(){
        System.out.println("Display three is here");
    }
}