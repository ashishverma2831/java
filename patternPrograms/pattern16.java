package patternPrograms;

public class pattern16 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ 
            for(int j=1,k=i;j<=5;j++){
                System.out.printf("%4d",k);
                k++;
            }
            System.out.println();
        }
    }
}
