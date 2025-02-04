class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    public Child(){
    System.out.println("child constructor");
}
}
class Grandchild extends Child{
    public Grandchild(){
        System.out.println("GrandChild Constructor");
    }
}
public class TestChild{
    public static void main(String args[]){
        //Parent obj=new Parent();
       // Child obj=new Child();
      Grandchild obj=new Grandchild();

        
    }
}