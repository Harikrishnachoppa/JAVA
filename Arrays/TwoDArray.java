public class TwoDArray{
    public static void main(String args[]){
        int A[][]={{2,4,6,8},{4,8,12,16}};
       // for(int i=0;i<A.length;i++){
            //for(int j=0;j<A[0].length;j++){
              //  System.out.println(A[i][j]);
            //}
           // System.out.println();
       // }
        for(int x[]:A){
            for(int y:x){
                System.out.println(y);
            }
        }

    }
}