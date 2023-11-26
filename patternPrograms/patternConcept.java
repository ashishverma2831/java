package patternPrograms;

public class patternConcept {
    public static void main(String[] args) {
        // pattern 1
        for(int i=1,p=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("%4d",p);
                p++;
            }
            System.out.println();
        }
        System.out.println("  ******************");
        //pattern 2
        for(int i=5,q=1;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.printf("%4d",q);
                q++;
            }
            System.out.println();
        }
        System.out.println("  ******************");
        //pattern 3
        for(int i=1,r=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                System.out.printf("%4d",r);
                r++;
            }
            System.out.println();
        }
        System.out.println("  ******************");
        //pattern 2
        for(int i=5,s=1;i>=1;i--){
            for(int j=5;j>=1;j--){
                System.out.printf("%4d",s);
                s++;
            }
            System.out.println();
        }
    }
}
// same banega sabme
// no difference