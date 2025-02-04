import java.lang.*;
import java.util.Scanner;
class str{
    public static void main(String args[]){
        String s1=new String("java");
        String s2="javafgggg";
        String s3="java";
        if(s1==s3){
            System.out.println("s1 and s2 are same");
        }else{
            System.out.println("s1 and s2 are not same");
        }
        System.out.println(s2.length());
        System.out.println(s3.toUpperCase());
    }
}