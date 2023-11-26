package javaLangPackage;

public class deptEnum {
    public static void main(String[] args) {
        dept d1 = dept.CS;
        dept d2 = dept.IT;
        dept d3 = dept.CIVIL;
        dept d4 = dept.ECE;

        System.out.println(d1.ordinal());
        System.out.println(d1.head);
        System.out.println(d1.location);
        System.out.println();

        System.out.println(d2.ordinal());
        System.out.println(d2.head);
        System.out.println(d2.location);
        System.out.println();

        System.out.println(d3.ordinal());
        System.out.println(d3.head);
        System.out.println(d3.location);
        System.out.println();

        System.out.println(d4.ordinal());
        System.out.println(d4.head);
        System.out.println(d4.location);
        System.out.println();
        
        for (dept i : dept.values()) {
            System.out.println(i);
        }
    }
}

// enum = set of constants or fixed values

enum dept{
    CS("John","Block A"),
    IT("Smith","Block B"),
    CIVIL("Srinivas","Block C"),
    ECE("Dave","Block D");

    String head;
    String location;

    private dept(String head,String loc){
        this.head=head;
        this.location=loc;
    }
    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}