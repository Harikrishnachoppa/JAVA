import java.lang.*;
import java.util.Scanner;
public class conditional {
public static void main(String args[]){
int a,b,c;
System.out.println("Enter the values of a b and c");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c){
System.out.println("The greter the value  is a");
}
else if(b>c){
System.out.println("The greater value is b");
}
else{
System.out.println("The greater value is c");
}
}
}