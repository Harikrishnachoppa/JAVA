import java.io.*;
public class bytearrayoutput{
    public static void main(String args[])throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(10);
        bos.write('H');
        bos.write('A');
        bos.write('R');
        bos.write('I');
        bos.writeTo(new FileOutputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/byteoutputtext.txt"));
        /*byte b[]=bos.toByteArray();
        for(int x: b){
            System.out.print((char)x);
        }*/
        bos.close();




    }
}