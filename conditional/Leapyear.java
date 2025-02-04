import java.lang.*;
import java.util.Scanner;
class Leapyear{
    public static void main(String args[]){
        int year;
        System.out.println("Enter the year: ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year %4 ==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("it is leap year");
                }
                else{
                System.out.println("Not a leap year");
            }
        }
            else{
                System.out.println("Not a leap year");

            }
    }
    else{
        System.out.println("Not a Leap Year");

    }

}
}
