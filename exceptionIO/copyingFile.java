package exceptionIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyingFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/source2.txt");
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/source4.txt");

        // String str = "JAVA PROGRAMMING";
        // byte b[] = str.getBytes();
        // fos.write(b);

        // byte b1[] = new byte[fis.available()];
        // fis.read(b1);
        // String str2 = new String(b1).toLowerCase();
        // System.out.println(str2);

        // int x;
        // while((x=fis.read())!=-1){
        //     if(x>=65 && x<=90){
        //         fos.write(x+32);
        //     }
        //     else{
        //         fos.write(x);
        //     }
        // }
        
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String str = new String(b).toLowerCase();
        // System.out.println(str);
        fos.write(str.getBytes());

        fis.close();
        fos.close();
    }
}
