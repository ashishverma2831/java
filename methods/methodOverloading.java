package methods;

public class methodOverloading {
    public static void main(String[] args) {
        // int maxNumbers = max(2,3);
        // int maxNumbers = max(2,3,8);
        float maxNumbers = max(2.4f,3.8f);
        System.out.println("The largest number is "+maxNumbers);
    }

    static int max(int x,int y){
        return x>y?x:y;
    }

    static int max(int x,int y,int z){
        return x>y && x>z ? x : (y>z?y:z);
    }

    static float max(float x,float y){
        return x>y?x:y;
    }
}
