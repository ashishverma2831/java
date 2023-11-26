package exceptionIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class bufferedStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/mine.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // System.out.println("File "+fis.markSupported());
        // System.out.println("Buffer "+bis.markSupported());
       
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        // bis.mark('N');
        bis.mark(2);
        System.out.println(bis.read());
        System.out.println(bis.read());
        // bis.mark(2);
        bis.reset();
        System.out.println(bis.read());
        System.out.println(bis.read());
        // bis.reset();
        // System.out.println(bis.read());
        // System.out.println(bis.read());

        System.out.println("*********************");
        byte b[] = new byte[bis.available()];
        b=bis.readAllBytes();
        for (byte c : b) {
            System.out.println(c);
        }
        
        fis.close();
        bis.close();
    }
}
