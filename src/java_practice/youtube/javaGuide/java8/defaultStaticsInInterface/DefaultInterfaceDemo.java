package java_practice.youtube.javaGuide.java8.defaultStaticsInInterface;

public class DefaultInterfaceDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        vehicle.m1();
        vehicle.m2();
        vehicle.m3();
    }
}

interface Vehicle{

    void m1();
    default void m2(){
        System.out.println("this is m2 default method from vehicle interface");
    }

    default void m3(){
        System.out.println("this is m3 default method from vehicle interface");
    }

}

class VehicleImpl implements Vehicle {

    @Override
    public void m1() {
        System.out.println("this is m1 default method from vehicleImpl class");
    }

    @Override
    public void m3(){
        System.out.println("this is m3 default method from vehicleImpl class");
    }
}
