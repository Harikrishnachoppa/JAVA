import java.util.*;

public class PracticeFileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
        // Read integers into the first ArrayList
        System.out.println("Enter the first set of integers (terminate with a non-integer value):");
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        
        // Consume the non-integer value
        sc.next();
        
        // Read integers into the second ArrayList
        System.out.println("Enter the second set of integers (terminate with a non-integer value):");
        while (sc.hasNextInt()) {
            al2.add(sc.nextInt());
        }
        
        // Calculate the union
        ArrayList<Integer> union = new ArrayList<>(al);
        union.addAll(al2);
        System.out.println("Union: " + union);
        
        // Calculate the intersection
        ArrayList<Integer> intersection = new ArrayList<>(al);
        intersection.retainAll(al2);
        System.out.println("Intersection: " + intersection);
    }
}
