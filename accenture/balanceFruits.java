package accenture;

public class balanceFruits {
    public static void main(String args[]){
        balanceFruits obj = new balanceFruits();
        int result  = obj.BalanceFruits(10, 20, 30);
        System.out.println(result);
    }

    int BalanceFruits(int a,int m,int rs){
        if(a>m){
            return rs-(a-m);
        }
        else if(a<m){
            return rs+(m-a);
        }
        return 0;
    }
}
