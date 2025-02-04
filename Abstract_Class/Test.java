abstract class Super{
    public Super(){
        System.out.println("Super class Constructor");
    }
    public void  method1(){
        System.out.println("Super class method1");

    }
    abstract public void  method2();
}
class sub extends Super{
        public void method2(){
            System.out.println("Sub class method2");

        }
        
    }
public class Test{
    public static void main(String args[]){
        Super s1=new sub();
        s1.method1();
        s1.method2();
    }

}