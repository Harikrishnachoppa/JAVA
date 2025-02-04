import java.lang.*;
import java.util.Scanner;
class Fibonaccic{
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n;
        System.out.println("Enter the no of terms: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Display the Fibonaccic Series: ");
        System.out.print(a+","+b);
        for(int i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;

        }

    }
}