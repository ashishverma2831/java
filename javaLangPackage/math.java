package javaLangPackage;

public class math {
    public static void main(String[] args) {
        double i=123.83345677d;
        System.out.println(Math.E);
        System.out.println(StrictMath.E);

        System.out.println(Math.PI);
        System.out.println(StrictMath.PI);

        // System.out.println(Math.TAU);
        // System.out.println(StrictMath.TAU);

        System.out.print("Absolute :");
        System.out.println(Math.abs(-123));
        
        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-123));

        System.out.println(Math.round(i));

        // gives sign - 1.0 for positive and -1.0 for negative
        System.out.println(Math.signum(i));

        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(27));

        double a=12.84;
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));
        
        System.out.println(Math.floorDiv(11, 2));
        // System.out.println(Math.floorDivExact(11, 2));
        
        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 13));
        System.out.println(Math.nextAfter(12.5, 11));

        // System.out.print("Exponent value in Floating Point Rep. :");
        // System.out.println(Math.getExponent(123.4523));

        System.out.print("e power x :");
        System.out.println(Math.exp(2));
    }
}
