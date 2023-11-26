package collectionFramework;

import java.util.ArrayList;

public class collectionConcept {
    public static void main(String[] args) {
        
        ArrayList<helloDear> hi = new ArrayList<>();
        // ye array ab helloDear ka object store kregi aur return kregi
        helloDear hd = new helloDear("scott","lucknow","9009292393",20);
        // System.out.println(hd.getName());
        hi.add(hd);
        
        // helloDear hddd = new helloDear();
        // System.out.println(hddd.getName());

        // System.out.println(hi);
        for (helloDear hddd : hi) {
            System.out.println(hddd.getName());
            System.out.println(hddd.getAddress());
            System.out.println(hddd.getPhone());
            System.out.println(hddd.age);
        }


        hi.forEach(n->System.out.println(n));
    }
}

class helloDear{
    private String name,address,phone;
    int age;

    public helloDear() {
    }

    public helloDear(String name, String address, String phone,int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
}