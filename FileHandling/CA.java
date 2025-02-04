import java.io.*;
public class CA{
    public static void main(String args[]){
   
        ByteArrayOutputStream bis=new ByteArrayOutputStream(20);
        bis.write('H');
        bis.write('K');
        bis.write('A');
        bis.write('M');
        byte A[]=bis.toByteArray();
        for(byte i : A){
            System.out.println((char)i);
        }
    }
}