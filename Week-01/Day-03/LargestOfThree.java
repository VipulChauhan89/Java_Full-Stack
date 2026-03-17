public class LargestOfThree {
    public static void main(String[] args) {
        int a = 1, b = 4, c = 3;
        if(a>=b && a>=c) {
            System.out.println("Largest number is " + a);
        } else if(b>=a && b>=c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Latget  number is " + c);
        }
    }
}
