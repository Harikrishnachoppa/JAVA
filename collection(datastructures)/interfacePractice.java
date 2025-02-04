import java.util.*;
interface Test1{
    int x=10;
   void meth1();
    void meth2();
    default void meth3(){
        System.out.println("Meth3 of test: ");
    }
}
interface Test2 extends Test1{
    void meth4();
}
class Test3 implements Test2{
    public void meth1(){}
   public  void meth2(){}
    public void meth4(){}
}
public class interfacePractice{
    public static void main(String args[]){
        System.out.println(Test.x);
        Test3 t=new Test3();
        t.meth3();
    }
}