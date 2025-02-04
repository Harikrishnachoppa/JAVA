class Super{
    public void method1(){
        System.out.println("Super class Method 1");
    }
    public void method2(){
        System.out.println("Super class Method 2: ");
    }
    public void method3(){
        System.out.println("Super class Method 3");
    }
    
}
class Sub extends Super{
    public void method3(){
        System.out.println("Sub class Method 3");
    }
    public void method4(){
        System.out.println("Sub class Method 4");
    }
}
public class DynamicDispatch{
    public static void main(String args[]){
        Super obj=new Sub();
        obj.method1();
        obj.method3();
       // obj.method4();




    }
}