package oops.inheritance;

public class inheritParamConstructor {
    public static void main(String[] args) {
        // parent p = new parent(6);
        // childC c = new childC(6);
        // parentP p = new parentP();
        // childC c1 = new childC();
        // childC c = new childC(10, 20);
        // parentP p = new childC();
    }
}

class parentP{
    parentP(){
        System.out.println("non-param parent constructor");
    }
    parentP(int x){
        System.out.println("param parent constructor"+x);
    }
}

class childC extends parentP{
    childC(){
        System.out.println("non-param child constructor");
    }
    childC(int y){
        System.out.println("param child constructor");
    }
    childC(int x,int y){
        super(x);
        System.out.println("2 param child constructor"+y);
    }
}