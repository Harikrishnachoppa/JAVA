import java.lang.*;
import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=n;
        int r;
        int rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        if(rev==m){
        System.out.println("The given number is Palindrome");

    }
    else{
        System.out.println("Its not palindrome");
    }
    
    }
}