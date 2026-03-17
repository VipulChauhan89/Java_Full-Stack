public class ArrayIndexError {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 20;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array maximum index is 4 and you are trying to access the index beyound that index.");
        }
    }
}
