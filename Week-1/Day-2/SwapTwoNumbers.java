public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap -> A : " + a + " , B : " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After Swap -> A : " + a + " , B : " + b);
    }
}
