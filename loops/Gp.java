import java.lang.*;
import java.util.Scanner;
class Gp{
    public static void main(String args[]){
        int a,r,n;
        System.out.println("Enter the elements: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        int term =a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term*r;
        }

    }
}