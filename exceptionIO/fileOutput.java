package exceptionIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/test.txt");
            String str = "Java Programming ";

            byte b[] = str.getBytes();
            // for (byte c : b) {
            //     // System.out.println(c);
            //     fos.write(c);
            // }

            fos.write(b);
            // fos.write(str.getBytes());
            
            fos.close();  
            // you can do it with try with resources too...
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
