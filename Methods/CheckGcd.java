import java.util.Scanner;
public class GCD{
    static int CheckGcd(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }
    public static void main(String args[]){
        int m,n;
        System.out.println("Enter the m and n : ");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int result;
       result= CheckGcd(m,n);
       System.out.println("GCD of "+m+" and "+n+" is "+result);
    }
}