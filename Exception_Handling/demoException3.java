import java.util.*;
class NegativeDimensionException extends Exception{
    public String toString(){
        return "Negative dimension exception";
    }
}
public class  demoException3{
  
    public static int area(int l,int b)throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }else{
            return l*b;
        }
    }
    public static void meth1(int n1,int n2){
        try{
        int r=area(n1,n2);
        System.out.println(r);
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

         int n1=sc.nextInt();
          int n2=sc.nextInt();
        meth1(n1,n2);
       
    }
}