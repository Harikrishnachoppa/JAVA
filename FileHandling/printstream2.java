import java.io.*;
public class printstream2{
    public static void main(String agrs[])throws Exception {
        FileInputStream fis=new FileInputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/printstreamcopy.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        System.out.println("Roll no is "+s.rollno);
        System.out.println("name is "+s.name);
        System.out.println("dept is "+s.dept);

    }
}
class Student{
    int rollno;
    String name,dept;
}