public class Add {
    public static int add(int a,int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5, b = 3;
        int sum = add(a,b);
        System.out.println("Sum of " + a + " + " + b + " is = " +sum);
    }
}
