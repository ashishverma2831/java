package patternPrograms;

public class pattern40_41 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int k=2;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
        System.out.println("----------");
        // pattern 41
        for(int i=1,k=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
