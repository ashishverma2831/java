package exceptionIO;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\java\\exceptionIO\\student1.txt");
        PrintStream ps = new PrintStream(fos);

        student s = new student();
        s.rollNo = 35;
        s.name = "Ahmed"; 
        s.dept = "CSE";

        student s1 = new student();
        s1.rollNo = 5;
        s1.name = "med"; 
        s1.dept = "CS";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.println(s1.rollNo);
        ps.println(s1.name);
        ps.println(s1.dept);

        fos.close();
        ps.close();
    }
}
class student{
    int rollNo;
    String name;
    String dept;
}