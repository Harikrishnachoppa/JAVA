import java.util.*;

public class sortingorder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        while (true) {
            str = sc.nextLine();
            if (!str.matches("[a-zA-Z]+")) {
                break;
            }
            arr.add(str);
        }
        System.out.println(arr);
    }
}
