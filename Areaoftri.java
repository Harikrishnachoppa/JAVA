import java.lang.*;
import java.util.Scanner;
class Areaoftri{
public static void main(String args[])
{
int base1,base2,base3;
float s;
double area;
System.out.println("Enter the base1 , base2 and base3  ");
Scanner sc=new Scanner(System.in);
base1=sc.nextInt();
base2=sc.nextInt();
base3=sc.nextInt();
s=(base1+base2+base3)/2f;
area=Math.sqrt(s*(s-base1)*(s-base2)*(s-base3));
System.out.println("The area of triangle is  "+area);
}
}



