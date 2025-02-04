 class Circle1{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double primeter(){
        return Math.PI*2*radius;
        
    }
}
public class Circle2{
    public static void main(String args[]){
        Circle1 obj=new Circle1();
        obj.radius=2.5;
       System.out.println( obj.area());
        System.out.println(obj.primeter());

    }
}