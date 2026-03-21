import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        // Print list
        System.out.println("List : " + list);
        // Remove element
        list.remove("Banana");
        System.out.println("After removing Banana : " + list);
        // Find element
        if(list.contains("Mango")) {
            System.out.println("Mango found in list.");
        } else {
            System.out.println("Mango not found in list.");
        }
    }
}
