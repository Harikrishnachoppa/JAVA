public class Arraymissing{
    public static void main(String args[]){
        int A[]={1,2,3,4,6,7,8};
        int diff=A[0]-0;
        for(int i=0;i<7;i++){
            if(A[i]-i!=diff){
                System.out.println(i+diff);
                break;
            }
    
        }
    }
}