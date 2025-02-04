public class Hari{
    public static void main(String args[]){
        int A[]={10,5,6,4,2,7};
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        for(int a:B){
            System.out.println(a);
        }
    }
}