package javaLangPackage;

public class wrapperDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.MAX_VALUE;
        System.out.println(i1);

        Integer i2 = Integer.MIN_VALUE;
        System.out.println(i2);

        Integer i3 = Integer.BYTES;
        System.out.println(i3);

        // in bits
        Integer i4 = Integer.SIZE;
        System.out.println(i4);

        Integer a = Integer.valueOf(10);
        Integer b=10;
        System.out.println(a);
        System.out.println(b);

        Byte c=15;
        Byte d=Byte.valueOf("15");
        System.out.println(c);
        System.out.println(d);

        Short f=Short.valueOf("123");
        System.out.println(f);
        
        Float g=12.3f;
        System.out.println(g);
     
        Double j=Double.valueOf(123.456);
        System.out.println(j);
        
        Character k=Character.valueOf('A');
        System.out.println(k);
        
        Boolean l=Boolean.valueOf("true");
        System.out.println(l);
        
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        System.out.println(e);
        
        Float h=Float.valueOf("123.5");
        float x=h.floatValue();
        float y=h;
        System.out.println(x);
        System.out.println(y);
        
        int m=10;
        //Integer n=Integer.valueOf(m);
        Integer n=m;
        //int p=n.intValue();
        int p=n;
        System.out.println(p);

        Integer m0=Integer.valueOf("1111", 16);
        System.out.println(m0);

        int m1=15;
        Integer m2=m1;
        Integer m3=15;
        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));
        System.out.println(m3);

        Integer m4=Integer.valueOf("A7", 16);
        Integer m5=Integer.decode("0xA7");
        System.out.println(m4);
        System.out.println(m5);

        System.out.println(Integer.parseInt("12345")==12345);
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toHexString(40));
        System.out.println(Integer.toBinaryString(40));
        System.out.println(Integer.toOctalString(40));

        Integer i7 = 15;
        System.out.println(Integer.bitCount(i7));

        int n1=35;
        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.bitCount(n1));

        float a1=12.5f;
        Float b2=12.5f;
        Float b3=-12.5f/0;
        Float b1=(float)Math.sqrt(9);
        
        System.out.println(b2.equals(a1));
        System.out.println(b3.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY==b3);
        System.out.println(b3==Float.NEGATIVE_INFINITY);
        System.out.println(b1.isNaN());
        System.out.println(b1!=Float.NaN);
    }
}
