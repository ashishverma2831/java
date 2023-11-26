package exceptionIO;
import java.io.*;;

public class randomAccessFile {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf = new RandomAccessFile("C:/Users/HP/Desktop/java/exceptionIO/testN.txt","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());

        //read whole text
        // System.out.println(rf.readLine());

        rf.write('e');
        System.out.println((char)rf.read());

        rf.skipBytes(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()-3);
        System.out.println((char)rf.read());

        rf.close();
    }
}
