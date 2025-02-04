import java.util.Scanner;
public class PrimeMethod
{
    static boolean Checkprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        }
    public static void main(String args[]){
        int number;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(Checkprime(number)){
            System.out.println(number+" Is a prime number ");
        }
        else {
            System.out.println(number+" is not a prime number");
        }
    }
}