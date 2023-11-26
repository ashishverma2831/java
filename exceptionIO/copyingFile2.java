package exceptionIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class copyingFile2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/source2.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/source4.txt");

        FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/source5.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        // copying data of both files in single file 
        int x;
        while((x=sis.read())!=-1){
            fos.write(x);
        }

        fis1.close();
        fis2.close();
        fos.close();
        sis.close();

    }
}
