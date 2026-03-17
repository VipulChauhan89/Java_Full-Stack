public class Search {
    public static boolean search(int[] arr, int num) {
        boolean found = false;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == num) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 4;
        boolean found = search(arr, num);
        if(found) {
            System.out.println(num + " is found in Array.");
        } else {
            System.out.println(num + " is not found in Array.");
        }
    }
}
