import java.io.*;
public class ByteDemo{
    public static void main(String args[]) throws Exception{
        char A[]={'A','B','C','D'}; 
        CharArrayReader ba=new CharArrayReader(A);
        //String str=new String(ba.readAllBytes());
        //System.out.println(str);
        int i;
        while((i=ba.read())!=-1){
            System.out.print((char)i);
        }
        //System.out.println(ba.markSupported());
        ba.close();
    }
}