package javaLangPackage;

public class object {
    public static void main(String[] args) {
        myObject o = new myObject();
        myObject o2 = new myObject();

        System.out.println(o.getClass());
        System.out.println(o.toString());
        System.out.println(o.hashCode());
        
        object o1 = new object();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        // System.out.println(o.equals(o1));
        System.out.println(o.equals(o2));
        
        // o.notify();
        // o.notifyAll();
    }

    public int hashCode(){
        return 200;
    }
}

class myObject{
    public String toString(){
        return "hello";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
