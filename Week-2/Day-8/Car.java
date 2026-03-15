public class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand of car : " + this.brand);
        System.out.println("Model of car : " + this.model);
        System.out.println("Price of car : " + this.price);
    }

    public static void main(String[] args) {
        Car c = new Car("Mahindra", "Thar", 1719000.0);
        c.displayDetails();
    }
}
