import java.lang.*;
import java.util.Scanner;
class Digits{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int r;
        int count=0;
        while(n>0){
            r=n%10;
            n=n/10;
            count++;
           // System.out.println(r);
            
        }
        System.out.println(count);
     

    }
}