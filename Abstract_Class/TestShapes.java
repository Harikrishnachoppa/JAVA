abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Circle extends Shape{
    double radius;
    public Circle(double r){
        radius=r;

    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Shape{
    double length,breadth;
    public Rectangle(double l,double b){
        length=l;
        breadth=b;

    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
       return  2*(length*breadth);
        
    }
}
public class TestShapes{
    public static void main(String args[]){
        Shape s1=new Circle(5);
        System.out.println("Area of Circle : "+s1.area());
        System.out.println("perimeter of Circle : "+s1.perimeter());

        Shape s2=new  Rectangle(3,4);
        System.out.println("Area of Rectangle: "+s2.area());
        System.out.println("perimeter of Rectangle: "+s2.perimeter());


    }
}