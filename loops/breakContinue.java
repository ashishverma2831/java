package loops;

public class breakContinue {
    public static void main(String[] args) {
        //break
        for(int i=0;i<10;i++){
            if(i==4){
                System.out.println("Hii");
                break;
            }
            System.out.println(i);
        }
        System.out.println("$$$$$$$$");
        for(int i=0;i<10;i++){
            if(i==4){
                System.out.println("Hii");
                continue;
            }
            System.out.println(i);
        }
    }
}
