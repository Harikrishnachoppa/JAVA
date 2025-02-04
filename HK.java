import java.util.Scanner;
public class HK{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        while(n>=10){
            n=n/10;
        }
        int diff=n-last;
        System.out.println(diff);
    }
}