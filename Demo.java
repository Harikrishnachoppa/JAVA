class MyClass{
    int x,y;
    public void add1(){
        x=6;
        y=8;
        System.out.println(x+y);
    }
    public void add2(int s,int t){
        x=s;
        y=t;
        System.out.println(x+y);
    }

}
 public class Demo{
    public static void main(String args[]){
        MyClass m=new MyClass();
        m.add1();
        m.add2(9,4);
        

    }
}