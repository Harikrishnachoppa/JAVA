import java.lang.*;
import java.util.Scanner;
class cuboid{
public static void main(String args[])
{
int length,breadth,height;
double area;
double volume;
System.out.println("Enter the length,breadth and height  " );
Scanner sc=new Scanner(System.in);
length=sc.nextInt();
breadth=sc.nextInt();
height=sc.nextInt();
area=2*(length*breadth+breadth*height+length*breadth);
volume=length*breadth*height;
System.out.println("The area of cuboid is  "+area);
System.out.println("The volume of cuboid is "+volume);
}
}
