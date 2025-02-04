import java.io.*;
public class pratice{
    public static void main(String args[])throws Exception{
       FileOutputStream fo=new FileOutputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/tempory.txt");
       FileInputstream fi=new FileInputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/tempory.txt");

       
        String str="My name is harikrishna";
        fo.write(str.getBytes());
        byte A[]=new byte[fi.available()];
        fi.read(A);
        String s=new String(A);
        System.out.println(A);

        System.out.println("Data written successfully");
        fo.close();
       
    }
}