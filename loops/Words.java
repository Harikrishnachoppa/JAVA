import java.lang.*;
import java.util.Scanner;
class Words{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int r;
        String s="";

        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;

            
        }
        System.out.println(s);
        char c;
        for(int i=s.length()-1;i>=0;i--){
            c= s.charAt(i);
            switch(c){
                case '0':
                System.out.print("Zero");
                break;
                case '1':
                System.out.print("One");
                break;
                case '2':
                System.out.print("Two");
                break;
                case '3':
                System.out.print("Three");
                break;
                case '4':
                System.out.print("Four");
                break;
                case '5':
                System.out.print("Five");
                break;
                case '6':
                System.out.print("Six");
                break;
                case '7':
                System.out.print("Seven");
                break;
                case '8':
                System.out.print("Eight");
                break;
                case '9':
                System.out.print("Nine");
                break;
              


            }
        }

    }
}