public class Method1{
    static int max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String args[]){
        int a=15,b=7,c;
        c=max(a,b);
        System.out.println(c);

    }
}