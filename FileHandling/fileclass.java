import java.io.*;
public class fileclass{
    public static void main(String args[]){
        File f=new File("C:/Users/hari/OneDrive/Desktop/javaproject");
        System.out.println(f.isDirectory());
        String str[]=f.list();
        for(String i:str){
            System.out.println(i);
        }
    }
}