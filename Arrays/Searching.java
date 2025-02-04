import java.util.Scanner;
public class Searching{
    public static void main(String args[]){
        int a[]={2,6,4,10,8};
        for(int i:a){
            System.out.println(i);
        }
        int key;
        System.out.println("Enter the key element: ");
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("The element finds at index no: "+i);
                System.exit(0);
            }
        }
        System.out.println("THe element is not found");
        
    
    }
}