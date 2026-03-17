public class Sum {
    public static int sum(int[] arr) {
        int n = arr.length, result = 0;
        for(int i = 0; i < n; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = sum(arr);
        System.out.println("Sum is = " + result);
    }
}
