import java.lang.*;
import java.util.Scanner;
class Multitable{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int product=1;
        for(int i=1;i<=20;i++){
            product=(n*i);
            System.out.println(n+"*"+i+"="+product);
        }
    }
}