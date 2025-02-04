class parent{
  
    public parent(int x){
        System.out.println("param parent "+x);
 }
}
class child extends parent{
    public child(){
        System.out.println("Non-param child");

    }
    public child(int x){
        
        System.out.println("param child1");

    }
  
}
public class ParamChild{
    public static void main(String args[]){
       // child obj=new child();
       child obj=new child();
       System.out.println();
       child obj1=new child(20);

    }
}