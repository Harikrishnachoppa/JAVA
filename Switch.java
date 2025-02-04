//Write a java programm to a check the even letter is vowel or constan
import java.lang.*;
import java.util.Scanner;
public class Switch{
public static void main(String args[]){
System.out.println("ENter the letter");
char t;
Scanner sc=new Scanner(System.in);
t=sc.next().charAt(0);
switch(t){
case 'a':
System.out.println("The letter "+t" is vowel");
break;
case 'e':
System.out.println("The letter  "+t" is vowel");
break;
case 'i':
System.out.println("The letter"+t" i is vowel");
break;
case 'o':
System.out.println("The letter "+t"  is vowel");
break;
case 'u':
System.out.println("The letter "+t" is vowel");
break;
default:
System.out.println("The letter is constant");


}


}
}