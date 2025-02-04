import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      ArrayList<String> al=new ArrayList<>();
      while(true){
        String str=sc.nextLine();
        if(!str.matches("[a-zA-Z]+")){
          break;

        }
        al.add(str);
      }
      Collections.sort(al);
      for(String s: al){
        System.out.print(s+" ");
      }
      
 
    }
}
