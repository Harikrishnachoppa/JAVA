public class Addition{
    public static void main(String args[]){
        int a[][]={{2,4,6,8},{3,6,9,12},{4,8,12,16}};
        int b[][]={{5,10,15,20},{6,12,18,24},{7,14,21,28}};
        int c[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int x[]:c){
            for(int y:x){
                System.out.println(y+" ");
            }
        }
    }
}