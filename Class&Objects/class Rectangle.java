class Rectangle1{
    public int length;
    public int breadth;
    public int area(){
        return length*breadth;

    }
    public int primeter(){
        return 2*(length+breadth);
    }
}
public class Rectangle
{
    public static void main(String args[]){
        Rectangle1 obj=new Rectangle1();
        System.out.println("Enter the length and breadth");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        obj.length=l;
        obj.breadth=b;
        System.out.println("Area of rectangle is "+obj.area());
        System.out.println("Primeter of rectangle is "+obj.primeter());

        
    }

}