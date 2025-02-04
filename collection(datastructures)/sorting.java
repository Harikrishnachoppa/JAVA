import java.util.*;

public class sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(Integer x:arr){
           if( isprime(x)){
            arr2.add(x);
           }
            
        }
        System.out.println(arr2);
    }
        public static boolean isprime(int x){
            int count=0;

            for(int i=1;i<=x;i++){
                if(x==1){
                    return false;
                }
                if(x%i==0){
                    count++;
                }
                if(count>2){
                    return false;
                }
            }
            return true;
            
        }

       

        
     
}
