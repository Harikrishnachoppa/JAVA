public class ReverseCopyAnArray{
    public static void main(String args[]){
        int []A={2,4,6,8,10,12};
        int []B=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        for(int c:B){
            System.out.println(c);
        }
    }
}