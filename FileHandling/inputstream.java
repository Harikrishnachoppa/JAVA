import java.io.*;
public class inputstream{
    public static void main(String args[])throws Exception{
        try(FileInputStream fi=new FileInputStream("C:/Users/hari/OneDrive/Desktop/javaproject/FileHandling/hari.txt")){
        byte []A=new byte[fi.available()];
        fi.read(A);
        String b=new String(A);
        System.out.println(b);
    }
    System.out.println("End");

/*catch(FileNotFoundException e){
    System.out.println(e);
}
catch(IOException e){
    System.out.println(e);
}*/
}
}