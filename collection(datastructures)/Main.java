import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);

        // Displaying the elements in the deque
        System.out.println("Deque elements: " + deque);

        // Accessing elements in the deque
        int first = deque.getFirst();
        int last = deque.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Removing elements from the deque
        int removedElement = deque.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Deque after removal: " + deque);
    }
}
