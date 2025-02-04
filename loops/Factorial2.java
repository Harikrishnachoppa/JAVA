import java.lang.*;
import java.util.Scanner;

class Factorial2 {
    public static void main(String args[]) {
        int temp = 1;
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}