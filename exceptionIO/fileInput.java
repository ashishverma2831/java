package exceptionIO;

import java.io.FileInputStream;

public class fileInput {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/test.txt")) {
            byte b[] = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            System.out.println(str);

            // int x;
            // do {
            //     x=fis.read();
            //     if(x!=-1)
            //         System.out.print((char)x);
            // } while (x!=-1);

            // int x;
            // while((x=fis.read())!=-1){
            //     System.out.println((char)x);
            // }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
