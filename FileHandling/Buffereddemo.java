import java.io.*;
public class Buffereddemo{
    public static void main(String args[])throws Exception{
        FileReader is=new FileReader("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/new.txt");
        BufferedReader bis=new BufferedReader(is);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(20);
        System.out.print((char)bis.read());
         bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.println(bis.readLine());

        is.close();
        bis.close();





    }
}