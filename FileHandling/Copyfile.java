import java.io.*;
public class Copyfile{
    public static void main(String args[])throws Exception{
        FileInputStream fi1= new FileInputStream("new.txt");
        FileOutputStream fi2=new FileOutputStream("copyfile.txt");
        int i=0;
        while((i=fi1.read())!=-1){
            if(i>=65 && i<=120){
                fi2.write(i+32);
            }else{
                fi2.write(i);
            }
        }
        byte A[]=new byte[fi1.available()];
        fi2.read(A);
        String str=new String(A);
        System.out.println(str);
        
        fi1.close();
        fi2.close();

    }
}