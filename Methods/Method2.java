public class Method2{
    static void change(int B[],int index,int v){
        B[index]=v;
    }
    public static void main(String args[]){
        int A[]={2,6,8,10,12};
        change(A,1,4);
        for(int x:A){
            System.out.println(x);
        }

    }
}