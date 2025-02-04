import java.math.MathContext;
class Cylinder1{
    double radius;
    int height;
    public double areaoflid(){
        return Math.PI*radius*radius;
    }
    public double tsa(){
        return 2*(Math.PI*radius*radius)+(2*Math.PI*radius*height);
    }
}
public class Cylinder{
    public static void main(String args[]){
        Cylinder1 c=new Cylinder1();
        c.radius=7;
        c.height=10;
        MathContext hk=new MathContext(4);
        System.out.println(c.areaoflid());
        System.out.println(c.tsa());


    }
}