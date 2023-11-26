package oops.inheritance;

public class inheritConstructor {
    public static void main(String[] args) {
        // parent p = new parent();
        // child c = new child();
        // grandChild gc = new grandChild();
    }
}

class parent{
    public parent(){
        System.out.println("Parent constructor");
    }
}

class child extends parent{
    public child(){
        System.out.println("Child constructor");
    }
}

class grandChild extends child{
    public grandChild(){
        System.out.println("Grand child constructor");
    }
}