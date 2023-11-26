package patternPrograms;

public class pattern12 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int k=i;
            for(int j=1;j<=5;j++){
                System.out.printf("%4d",k);
                k+=5;
            }
            System.out.println();
        }
    }
}
