import java.util.Scanner;
public class reverse1{
    public static void main(String args[]){
                Scanner sc=new Scanner (System.in);
                System.out.print("Enter the number: ");
                int n=sc.nextInt();
                String temp="";
                int hk=n;
                int r;
                while(n>0){
                    r=n%10;
                    temp=temp+r;
                    n=n/10;
                }
                System.out.println("The reverse of "+hk+" is "+temp);
            }
        }