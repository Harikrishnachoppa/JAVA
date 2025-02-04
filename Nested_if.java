import java.util.Scanner;

class Nested_Demo {
    public static void main(String args[]) {
        int a, b, c;
        System.out.println("Enter the values of a, b, and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The a is the larger value.");
        } else if (b > c) {
            System.out.println("The b is the larger value.");
        } else {
            System.out.println("The c is the larger value.");
        }
    }
}
