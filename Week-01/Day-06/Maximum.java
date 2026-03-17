public class Maximum {
    public static int maximum(int[] arr) {
        int n = arr.length, mx = arr[0];
        for(int i = 1; i < n; i++) {
            if(mx < arr[i]) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30};
        int mx = maximum(arr);
        System.out.println("Maximum number is = " + mx);
    }
}
