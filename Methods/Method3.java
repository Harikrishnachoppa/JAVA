public class Method3
{
    static int max(int ...A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        int m= A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>m){
                m=A[i];
            }
        }
        return m;
      
    }
    public static void main(String args[]){
       max(2,6,3,8,9,4);
       System.out.println(max(2,6,3,8,9,4));
       System.out.println(max(45,23,67,8,43,2));
       
    }

}