import java.lang.*;
import java.util.Scanner;
class Young{
    public static void main(String args[]){
        int age;
        System.out.println("Enter the age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=14 && age<=55){
            System.out.println("The person is young");
        }else{
            System.out.println("The person is not  young");


        }
    }
}