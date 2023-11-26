package oops.Interface;

public class callbackMethod {
    public static void main(String[] args) {
        store s = new store();
        customer c1 = new customer("John");
        customer c2 = new customer("Smith");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}

interface Member{
    public void callback();
}

class store{
    Member members[] = new Member[10];
    int count=0;

    void register(Member m){
        members[count++]=m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            members[i].callback();
        }
    }
}

class customer implements Member{
    String name;

    customer(String n){
        name = n;
    }
    public void callback(){
        System.out.println("OK, I will visit,"+name);
    }
}