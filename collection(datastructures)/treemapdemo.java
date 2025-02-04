import java.util.Scanner;
import java.util.TreeMap;

public class treemapdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> treeMap = new TreeMap<>();

        System.out.println("Enter key-value pairs (type 'exit' to stop):");
        while (true) {
            String key = scanner.nextLine();
            if (!key.matches("[a-zA-Z]+")) {
                break;
            }
            System.out.print("Value: ");
            String value = scanner.nextLine();
            treeMap.put(key, value);
        }

        System.out.println("Key-Value pairs in TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
