import java.io.*;
public class File1{
    public static void main(String args[]){
        try{
        FileOutputStream fi=new FileOutputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/hari.txt");
        String str="Hello world";
        //fi.write(str.getBytes());
        byte A[]=str.getBytes();
        fi.write(A,6,str.length()-6);
        /*for(byte x:A){
            fi.write(x);
        }*/
        fi.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);

        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}