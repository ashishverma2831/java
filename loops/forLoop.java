package loops;

public class forLoop {
    public static void main(String[] args){
        // int i=1;
        // for(System.out.println("Hii!");i<=10;i++){
        //     System.out.println(i);
        // }
        // initialization and updation are optional
        // condition is necessary else it will be infinte loop

        for(int i=1,j=2;i<=10;i++,j=j*2){
            System.out.println(i+" "+j);
        }
    }
}
