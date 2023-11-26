package patternPrograms;

public class pattern14 {
    public static void main(String[] args){
        int num = 5;
        for(int i=5;i>=1;i--){
            int k=i;
            for(int j=1;j<=num;j++){
                System.out.printf("%4d",k);
                k=k+5;
            }
            System.out.println();
        }
    }
}
