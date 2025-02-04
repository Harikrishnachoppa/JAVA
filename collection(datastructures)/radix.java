import java.util.*;
import java.util.Scanner;
class radix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        if(num.matches("[0-1]+")){
            System.out.println("Binary radix=2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("octal radix=8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("decimal radix=10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("hexadecimal radix=16");
        }
        else{
            System.out.println("not a number");
        }
    }
}