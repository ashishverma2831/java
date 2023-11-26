package oops.constructor;

public class producerConsumer {
    public static void main(String[] args) {
        producer prod = new producer(1, "ashish verma");
        System.out.println("id and name "+prod.getName()+" "+prod.getProductId());
        prod.setName("saffa");
        System.out.println(prod.getName());
        
        consumer cons = new consumer(5, "vineet khand-1");
        System.out.println("address "+cons.getAddress());
        cons.setAddress("jaipuria");
        System.out.println("address "+cons.getAddress()+" "+cons.getCustomerId());
    }
}

class producer{
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name=name;
    }
    public producer(int productId,String name){
        this.productId=productId;
        this.name=name;
    }
}

class consumer{
    private int customerId;
    private String name;
    private String address;
    private int phoneNumber;

    public int getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public consumer(int customerId,String address){
        this.customerId=customerId;
        this.address=address;
    }
}
