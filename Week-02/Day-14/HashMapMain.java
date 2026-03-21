import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 85);
        map.put("Amit", 90);
        map.put("Priya", 95);
        for(String name : map.keySet()) {
            System.out.println(name + " -> " + map.get(name));
        }
    }
}
