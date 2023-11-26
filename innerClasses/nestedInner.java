package innerClasses;

public class nestedInner {
    public static void main(String[] args) {
        outerOI o = new outerOI();
        System.out.println(o.x);
        o.outerDisplay();
        o.i.innerDisplay();
        System.out.println(o.i.y);
        
        outerOI.inner oi = new outerOI().new inner();
        oi.innerDisplay();
    }
}
class outerOI{
    int x=20;

    class inner{
        int y=10;
        public void innerDisplay(){
            System.out.println("The value of Y is "+y);
            System.out.println("The value of X is "+x);
            // x is like global variables
        }
    }

    inner i = new inner();
    public void outerDisplay(){
        System.out.println(i.y);
    }
}