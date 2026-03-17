public class Power {
    public static int power(int a,int b) {
        int pow = 1;
        while(b-- != 0)
        {
            pow *= a;
        }
        return pow;
    }

    public static void main(String[] args) {
        int a = 2, b = 3;
        int pow = power(a,b);
        System.out.println(a + " ^ " + b + " = " + pow);
    }
}
