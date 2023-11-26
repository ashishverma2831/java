package innerClasses;

public class anonymousInner {
    public static void main(String[] args) {
        outer o = new outer();
        System.out.println(o.z);
        o.displayD();
    }
}
abstract class myM{
    abstract public void showS();
}
class outer{
    int z=10;
    public void displayD(){
        myM m = new myM() {
            public void showS(){
                System.out.println("Hello bhaiya");
            }
        };
        m.showS();
    }
}