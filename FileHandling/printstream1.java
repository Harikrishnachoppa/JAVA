import java.io.*;
public class printstream1{
    public static void main(String args[])throws Exception {
        FileOutputStream fos=new FileOutputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/printstreamcopy.txt");
        PrintStream ps=new PrintStream(fos);
        student obj=new student();
        obj.rollno=45;
        obj.name="Harikrishna";
        obj.dept="CSE";
        ps.println(obj.rollno);
        ps.println(obj.name);
        ps.println(obj.dept);
        

    }
}
class student{
    int rollno;
    String name;
    String dept;
}