
import java.util.*;

public class Arraylistdemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int size1 = sc.nextInt();
        sc.nextLine(); // Consume newline character
        ArrayList<String> al1 = new ArrayList<>(size1);
        for (int i = 0; i < size1; i++) {
            al1.add(sc.nextLine());
        }
        
        System.out.println("Enter the size of array2:");
        int size2 = sc.nextInt();
        sc.nextLine(); // Consume newline character
        ArrayList<String> al2 = new ArrayList<>(size2);
        for (int i = 0; i < size2; i++) {
            al2.add(sc.nextLine());
        }
        
        System.out.println("Array1: " + al1);
        System.out.println("Array2: " + al2);
        
        al1.addAll(al2);
        System.out.println("Merged Array: " + al1);
        
        al1.remove(4);
        System.out.println("Array after removing element at index 4: " + al1);
        
        System.out.println("Elements of merged array using loop:");
        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }
        
        al1.retainAll(al2);
        System.out.println("Common elements between array1 and array2: " + al1);
    }
}
