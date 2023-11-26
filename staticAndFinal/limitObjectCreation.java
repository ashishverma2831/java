package staticAndFinal;

public class limitObjectCreation {
    public static void main(String[] args) {
        limitClass l1 = limitClass.getInstance();
        limitClass l2 = limitClass.getInstance();
        limitClass l3 = limitClass.getInstance();
        limitClass l4 = limitClass.getInstance();
        limitClass l5 = limitClass.getInstance();
        limitClass l6 = limitClass.getInstance();

        System.out.println("-----------------------------------");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println("-----------------------------------");

    }
}

class limitClass{
    private static limitClass lm;
    private static int objectCount = 0;
    // public static int objectCount = 0;

    private limitClass(){
        objectCount++;
    }
    static limitClass getInstance(){
        if(objectCount < 4){
            lm = new limitClass();
        }
        return lm;
    }
}