public class CountEven {
    public static int count(int[] arr) {
        int n = arr.length, c = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = count(arr);
        System.out.println("Count of even numbers is = " + ans);
    }
}
