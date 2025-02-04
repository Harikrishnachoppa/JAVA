class Rectangle{
    int length;
    int breadth;
    public Rectangle(){
        length=breadth=1;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }

}
class Cuboid extends Rectangle {
    int height;
    public Cuboid(){
        height=1;
    }
    public Cuboid(int h,int l,int b){
        super(l,b);
        height=h;
    }
    public int volume(){
        //return length*breadth*height;
        return area()*height;
    }
}
public class CuboidTest{
    public static void main(String args[]){
        Cuboid obj=new Cuboid(10,5,6);
        System.out.println("Volume of cylinder is "+obj.volume());
        System.out.println("Area of Rectangle is : "+obj.area());
    }
}