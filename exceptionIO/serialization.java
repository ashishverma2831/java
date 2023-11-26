package exceptionIO;

import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {
    // public static void main(String[] args) throws Exception{
    //     FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/exceptionIO/student3.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);

    //     stud s = new stud(10,"John",89.9f,"CSE");

    //     oos.writeObject(s);

    //     fos.close();
    //     oos.close();
    // }

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/java/exceptionIO/student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        stud s1 = (stud) ois.readObject();
        System.out.println(s1);

        ois.close();
        fis.close();
    }
}

class stud implements Serializable{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data = 10;
    public transient int t;

    public stud(){

    }
    public stud(int rollno, String name, float avg, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        // this.data = 500;
        this.t = 500;
    }
    public String toString(){
        return "\n Student Details\n"+
                "\n Roll NO "+rollno+
                "\n Name "+name+
                "\n Average "+avg+
                "\n Dept "+dept+
                "\n Data "+data+
                "\n Transient "+t+"\n";
    }
}