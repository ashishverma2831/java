package exceptionIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;

public class byteArrayStream {
    public static void main(String[] args) throws Exception{
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        // String str = new String(b);
        // System.out.println(str);

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // int x;
        // while((x=bis.read())!=-1){
        //     System.out.println((char)x);
        // }

        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());  
        System.out.println(str);
        bis.close();

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
 
        // byte b1[] = bos.toByteArray();
        // for (byte c : b1) {
        //     System.out.println((char)c);
        // }

        bos.writeTo(new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/source1.txt"));
        bos.close();

        char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr = new CharArrayReader(c);
        int y;
        while((y=cr.read())!=-1){
            System.out.print((char)y);
        }
        cr.close();
    }
}
