public class withoutImport {
    public static void main(String[] args) {
        java.lang.String s = new java.lang.String("Hello World");
        System.out.println(s);

        java.lang.String str;
        str = new java.lang.String("Hello World Again");
        System.out.println(str);
    }
}

// without writing import java.lang.String;
// or import java.lang.*;