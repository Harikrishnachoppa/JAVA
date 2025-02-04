class  Circle{
    double radius=1;
    public Circle(){
       // radius=1;
        System.out.println("Parent clsss Constructor: ");
    }
    public Circle(double r){
        radius=r;
    }
    public  double area(){
        return 2*Math.PI*radius*radius;
    }
}
class Cylinder  extends Circle{
    double height;
    public Cylinder(){
       // height=1;
        System.out.println("Child class  Constructor");
    }
    public Cylinder(double r,double h){
        height=h;
    }
    public double volume(){
        return area()*height;
    }

}
public class TestCylinder{
    public static void main(String args[]){
    Cylinder obj=new Cylinder(10,5);
    obj.area();
}
}