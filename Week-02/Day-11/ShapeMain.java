abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area()  {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape d = new Rectangle(4, 6);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Recatangle Area = " + d.area());
    }
}
