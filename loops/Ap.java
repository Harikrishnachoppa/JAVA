import java.lang.*;
import java.util.Scanner;
class Ap{
    public static void main(String args[]){
        int a,n,d;
        System.out.println("Enter the values : ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt(); 
        d=sc.nextInt(); 
        n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term+d;
        } 



    }
}