package loops;

public class scoping {
    public static void main(String[] args) {

        // for(int i=0;i<10;i++){
        //     System.out.println(i);
        // }
        // i works only inside for loop = scoping
        // System.out.println(i); 


        // i works because it is initialized and declared outside the for loop
        int i=5;
        for(;i<=10;i++){
            System.out.println(i);
        }
        i=100;
        System.out.println(i);

    }
}
