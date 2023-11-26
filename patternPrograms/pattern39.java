package patternPrograms;

public class pattern39 {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            int k=i;
            for(int j=1;j<=6-i;j++){
                System.out.printf("%2d",k);
                k++;
            }
            System.out.println();
        }
    }
}
