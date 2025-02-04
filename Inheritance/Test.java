class Circle{
    public double radius;
    public double area(){
        return Math.PI *radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Test{
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        c1.height=10;
        c1.radius=7;
        System.out.println("Volume of cylinder is : "+c1.volume());
        System.out.println("Area of circle is "+c1.area());
    }
}