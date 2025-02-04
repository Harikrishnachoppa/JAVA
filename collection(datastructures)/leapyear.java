import java.util.*;
class leapyear{
    public static void main(String args[]){
        int year;
        System.out.println("Enter the year ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.printf("%d is a leaf year\n",year);
                }
                else{
                    System.out.printf("%d is not leapyear\n",year);

                }
            }
            else{
                System.out.printf("%d is a leaf year\n",year);

            }

        }
        else{
            System.out.printf("%d is not leapyear\n",year);
          }
         
    }
}