package multiThreading;

public class copyWrite {
    public static void main(String[] args) {
        whiteboard wb = new whiteboard();
        teacher t = new teacher(wb);

        student s1=new student("1. John",wb);
        student s2=new student("2. Ajay",wb);
        student s3=new student("3. Kloob",wb);
        student s4=new student("4. Smith",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

class whiteboard{
    String text;
    int numberOfStudents=0;
    int count=0;

    public void attendance(){
        numberOfStudents++;
    }
    synchronized public void write(String t){
        System.out.println("Teacher is writing "+t);
        while(count!=0){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        text=t;
        count=numberOfStudents;
        notifyAll();
    }
    synchronized public String read(){
        while(count==0){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        String t=text;
        count--;
        if(count==0)
            notifyAll();
        return t;
    }
}

class teacher extends Thread{
    whiteboard wb;
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    public teacher(whiteboard w){
        wb=w;
    }
    public void run(){
        for(int i=0;i<notes.length;i++)
        wb.write(notes[i]);
    }
}

class student extends Thread{
    String name;
    whiteboard wb;
    public student(String n,whiteboard w){
        name = n;
        wb = w;
    }
    public void run(){
        String text;
        wb.attendance();

        do{
            text = wb.read();
            System.out.println(name + " Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}