package exceptionIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class dataStream {
    public static void main(String[] args) throws Exception {
        //writing in a file
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        //student2 is a binary file (if any file contains unreadable symbols that will be binary file)
        studentS s = new studentS();
        s.rollno=10;
        s.name = "Shubham";
        s.dept="CSE";
        s.avg=75.9f;

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

        // reading from file
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        studentS s1 = new studentS();
        s1.rollno = dis.readInt();
        s1.name = dis.readUTF();
        s1.avg = dis.readFloat();
        s1.dept = dis.readUTF();

        System.out.println("Roll no "+s1.rollno);
        System.out.println("Name "+s1.name);
        System.out.println("Average "+s1.avg);
        System.out.println("Dept "+s1.dept);

        dis.close();;
        fis.close();

    }
}

class studentS{
    int rollno;
    String name;
    float avg;
    String dept;
}
