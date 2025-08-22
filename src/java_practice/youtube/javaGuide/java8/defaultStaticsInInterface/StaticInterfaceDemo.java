package java_practice.youtube.javaGuide.java8.defaultStaticsInInterface;

public class StaticInterfaceDemo {

    public static void main(String[] args) {
        Vehicles vehicles = new Car();
        vehicles.speed();
        Vehicles.horn();
        Vehicles.noOfTires();

        Car car = new Car();
        car.horn();

    }

}


interface Vehicles{

    void speed();
    static void noOfTires(){
        System.out.println("this is noOfTires static method from vehicles interface");
    }

    static void horn(){
        System.out.println("this is horn static method from vehicles interface");
    }

}

class Car implements Vehicles {

    @Override
    public void speed() {
        System.out.println("this is speed method from vehicleImpl class");
    }

    public void horn(){
        System.out.println("this is horn method from vehicleImpl class");
    }
}

