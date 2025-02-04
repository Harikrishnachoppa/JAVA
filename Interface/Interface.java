interface Test{
    void testmethod1();
    void testmethod2();
}
class Mytest implements Test{
    public void testmethod1(){
        System.out.println("This is method 1");
    }
   public  void testmethod2(){
        System.out.println("This is method 2");
    }

}
public class Interface{
    public static void main(String args[]){
        Test t=new Mytest();
        t.testmethod1();
        t.testmethod2();


    }
}

