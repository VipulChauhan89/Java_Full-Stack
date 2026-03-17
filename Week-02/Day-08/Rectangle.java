public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2 * (this.length + this.width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        int ar = r.area();
        int pm = r.perimeter();
        System.out.println("Area of rectangle : " + ar);
        System.out.println("Perimeter of rectangle : " + pm);
    }
}
