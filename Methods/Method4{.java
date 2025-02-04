public class Method4{
    static int sum(int ...A){
        int s=0;
        for(int i=0;i<A.length;i++){
            s=s+A[i];
        }
        return s;
    }
    public static void main(String args[]){
       System.out.println(sum(1,2,3,4,5));
       System.out.println(sum(4,3,2,6));
    }
}