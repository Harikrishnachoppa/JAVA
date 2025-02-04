import java.lang.*;
import java.util.Scanner;
class Grades{
    public static void main(String args[]){
        int m1,m2,m3;
        System.out.println("Enter the marks: ");
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        double avg=(double)((m1+m2+m3)/3);
        if(avg>=70){
            System.out.println("A ");
        }
        else if(avg>=60 && avg<70){
            System.out.println("B ");

        }
        else if(avg>=50 && avg<60){
            System.out.println("c");

        }
        else if(avg>=40 && avg<50){
            System.out.println("E ");
      }
      else{
        System.out.println("F ");

      }

        }


    }
