import java.lang.*;
import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        int n;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int r;
        int m=n;
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
           
        }
        if(sum==m){
            System.out.println("The given number is armstrong number");
        }
        else{
            System.out.println("The given number is not armstrong number");
        }

    }
}