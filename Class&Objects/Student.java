import java.util.Scanner;
class Student1{
   public  int rollno;
   public  String name;
   public  String course;
   public  int m1,m2,m3;
   public int marks(){
    return m1+m2+m3;
   }
   public double average(){
    return (marks()/3);
   }
   public char  Grade(){
    if(average()>=70){
        return 'A';
    }
    else if(average()>=60 && average()<70){
        return 'B';
    }
    else if(average()>=50 && average()<60){
        return 'c';
    }
    else if(average()>=40 && average()<50){
        return 'D';
    }
    else{
        return 'F';
    }

   }
   public String Details(){
    return "Roll NO:-"+rollno+"\n"+"Name :- "+name+"\n"+ "Course :- "+course ;
   }
}
public class Student{
    public static void main(String args[]){
        Student1 s=new Student1();
        s.rollno=51;
       // s.name="Harikrishna";
       System.out.println("Enter the name of the student: ");
       Scanner sc=new Scanner(System.in);
       String nam=sc.nextLine();
              // s.name="Harikrishna";
                      s.name=nam;



        s.course="CSE";
        s.m1=75;
        s.m2=40;
        s.m3=80;
        System.out.println(" marks = "+s.marks());
        System.out.println("Average marks ="+s.average());
        System.out.println("Grade = "+s.Grade());
        System.out.println(s.Details());



    }
}