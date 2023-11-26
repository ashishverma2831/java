package methods;

class first{
    // public static void main(String args[]) {
    //     for (String string : args) {
    //         System.out.println(string);
    //     }
    // }

    // not practiced
    public static void main(String[] args) {
        double s=0;
        for(String x:args) 
        {
            if(x.matches("[0-9\\.]+"))
                s=s+Double.parseDouble(x);
        }
        System.out.println("Sum is "+s);
    }
} 