import java.io.*;
public class randomaccessfile{
    public static void main(String args[])throws Exception{
        RandomAccessFile raf=new RandomAccessFile("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/ADCD.txt","rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('e');
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.skipBytes(2);
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println(raf.getFilePointer());
        raf.seek(3);
        raf.write('Z');
        
     
        raf.close();








    }
}