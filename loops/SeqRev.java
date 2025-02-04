import java.util.Scanner;
public class SeqRev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String s=String.valueOf(n);
        String temp="";
        for(int i=0;i<s.length();i++){
            int digit=Character.getNumericValue(s.charAt(i));
            int sequare =digit*digit;
            temp=temp+sequare;

        }
        System.out.println(temp);

    }
}