import java.lang.*;
import java.util.Scanner;
class Radix{
    public static void main(String args[]){
        String n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextLine();
        if(n.matches("[01]+")){
            System.out.println("Binaray 2");
        }
        else if(n.matches("[0-9]+")){
            System.out.println("Decimal 10");


        }
        else if(n.matches("[0-9A-F]+")){
            System.out.println("Hexa Decimal 16");

        }
        else if(n.matches("[0-7]+")){
            System.out.println("octal 8");

        }
        else{
            System.out.println("it is not a number");

        }

    }
}