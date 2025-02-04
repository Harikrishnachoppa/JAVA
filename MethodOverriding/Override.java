class Super{
    public void display(){
        System.out.println("Display Superclass");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Display SubClass");
    }
}
public class Override{
    public static void main(String args[]){
        Super obj1=new Super();
        Sub obj2=new Sub();
        Super obj3=new Sub();
        obj1.display();
        obj2.display();
        obj3.display();
        
        
    }
}