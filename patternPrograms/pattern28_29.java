package patternPrograms;

public class pattern28_29 {
    public static void main(String[] args){
        for(char i='E';i>='A';i--){
            for(int j=5;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------");
        //pattern 29
        for(int i=5;i>=1;i--){
            for(char j='E';j>='A';j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
