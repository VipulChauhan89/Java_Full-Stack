interface Vehicle {
    public void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Cars is started.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is started.");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();
        c.start();
        b.start();
    }
}
