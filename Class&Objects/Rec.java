class rec1{
    private int l;
    private int b;
    public int area(int a,int c){
        l=a;
        b=c;
        return l*b;
    }
}
public class Rec{
    public static void main(String args[]){
        rec1 r1=new rec1();

      System.out.println(r1.area(2,4));
      

    }
}