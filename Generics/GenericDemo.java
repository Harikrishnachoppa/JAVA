import java.lang.*;

public class GenericDemo<T> {
    T data[];

    public GenericDemo() {
        data = (T[]) new Object[3]; // Use 'Object' instead of 'object'
    }

    public static void main(String args[]) {
        GenericDemo<String> obj = new GenericDemo<>(); // Use diamond operator '<>' to avoid raw type
        obj.data[0] = "Hari";
        obj.data[1] = "Rohit";
        obj.data[2] = "Sharma";
        
        // Optional: Print the array to verify the contents
        for (String s : obj.data) {
            System.out.println(s);
        }
    }
}
