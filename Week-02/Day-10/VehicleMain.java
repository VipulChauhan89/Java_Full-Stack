class Vehicle {
    private String brand, model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    public void stop() {
        System.out.println(brand + " " + model + " is stopping...");
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
}

class Car extends Vehicle {
    public Car(String brand, String model, int doors) {
        super(brand, model);
    }

    public void start() {
        System.out.println("Car " + getBrand() + " " + getModel() + " starts.");
    }

    public void stop() {
        System.out.println("Car " + getBrand() + " " + getModel() + " stops.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, String model, boolean kickstand) {
        super(brand, model);
    }

    public void start() {
        System.out.println("Bike " + getBrand() + " " + getModel() + " starts.");
    }

    public void stop() {
        System.out.println("Bike " + getBrand() + " " + getModel() + " stops.");
    }

    public void wheelie() {
        System.out.println("Bike doing wheelie!");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Tata", "Nexon", 4);
        Vehicle v2 = new Bike("Royal Enfield", "Classic 350", true);

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

        ((Bike) v2).wheelie();
    }
}
