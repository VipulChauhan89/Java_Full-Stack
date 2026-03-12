public class MaximumOfThree {
    public static int maximum(int a,int b,int c) {
        if(a >= b && a >= c) {
            return a;
        } else if( b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static void main(String[] args) {
        int a = 1, b = 4, c = 2;
        int mx = maximum(a,b,c);
        System.out.println("Maximum among " + a + ", " + b + " and " + c + " is = " + mx);
    }
}
