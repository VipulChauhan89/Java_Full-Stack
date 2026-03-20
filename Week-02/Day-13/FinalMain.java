class Circle {
    final double PI = 3.14159;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double a = PI * radius * radius;
        System.out.println("Area of Cicle : " + a);
    }
}

public class FinalMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
    }
}
