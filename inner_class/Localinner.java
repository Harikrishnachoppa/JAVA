class outer{
    public void display(){
        class inner{
            void innerdisplay(){
                System.out.println("Hello world");
            }
        }
        inner obj=new inner();
        obj.innerdisplay();
    }
}
public class Localinner{
    public static void main(String args[]){
        outer o=new outer();
        o.display();
    }
}