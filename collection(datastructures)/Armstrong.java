import java.util.*;
class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        int on=n;
        int sum=0;
        int count=0;
        while(n!=0){
            int rem=n%10;
            count++;
        }
        while(n!=0){
            int r=n%10;
            int p=Math.pow(r,count);
            sum=sum+p;
            n=n/10;
            

        }
        if(sum==on){
            System.out.println("Given number is armstrong");
        }
        else{
            System.out.println("Given number is not a armstrong number");
        }


    }
}