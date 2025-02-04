import java.util.Scanner;
class arithemetic{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("The division is : "+c);
        }
        catch(Exception  p){
            System.out.println("denomineter not equal to 0 ,try again");
           // p.printStackTrace();
          // System.out.println(p.getMessage());
          System.out.println(p);
        }
        System.out.println("Bye");
    }
}