package twoDArrays;

public class arrayAddition {
    public static void main(String[] args){
        int arrayA[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arrayB[][] = {{9,8,7},{6,5,4},{3,2,1}};
        int arrayC[][] = new int[arrayA.length][arrayA[0].length];

        if(arrayA.length != arrayB.length || arrayA[0].length != arrayB[0].length){
            System.out.println("Order of the array is not same, Matrix addition cannot be possible.");
            return;
        }
        for(int i=0;i<arrayA.length;i++){
            for(int j=0;j<arrayA[0].length;j++){
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }
        for(int x[]:arrayC){
            for(int y:x){
                System.out.printf("%4d",y);
            }
            System.out.println();
        }
    }       
}
