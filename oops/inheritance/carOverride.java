package oops.inheritance;

public class carOverride {
    public static void main(String[] args) {
        oldCar car = new modernCar();
        car.changeGear();
        car.accelerator();
    }
}

class oldCar{
    public void start(){
        System.out.println("Old car starts");
    }
    public void changeGear(){
        System.out.println("Gear changed in old car");
    }
    public void accelerator(){
        System.out.println("Old car is accelerated");
    }
}
class modernCar extends oldCar{
    public void start(){
        System.out.println("Modern car starts");
    }
    @Override
    public void changeGear(){
        System.out.println("Gear changed in modern car");
    }
    public void openRoof(){
        System.out.println("Roof opened in modern car");
    }
    @Override
    public void accelerator(){
        System.out.println("Modern car is accelerated");
    }
}
