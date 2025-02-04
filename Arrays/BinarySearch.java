import java.util.Scanner;

public class BinarySearch {
   static int Search(int A[], int key) {
        int l = 0;
        int h = A.length - 1;
        int m = 0;
        while (l <= h) {
            m = (l + h) / 2;
            if (A[m] == key) {
                return m;
            } else if (A[m] < key) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();
        int a[] = {8, 2, 9, 6, 1, 3, 5};
        int result = Search(a, key);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element is not found");
        }
    }
}
