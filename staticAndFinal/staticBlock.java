package staticAndFinal;

public class staticBlock {

    // static{
    //     System.out.println("Block 1");
    // }
    public static void main(String[] args) {
        // testT t_1 = new testT();
        System.out.println("Main block");
        // testT t_2 = new testT();

    }
    // static{
    //     System.out.println("Block 2");
    // }
    // static{
    //     System.out.println("Block 5");
    // }
}

class testT{
    static{
        System.out.println("Block 3");
    }
    static{
        System.out.println("Block 4");
    }
}