public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum1 = c.add(5, 2);
        int sum2 = c.add(5, 2, 10);
        double sum3 = c.add(5.10, 6.7);
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3);
    }
}
