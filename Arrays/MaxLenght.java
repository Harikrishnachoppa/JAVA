import java.util.Scanner;
public class MaxLenght{
    public static void main(String args[]){
        int a[]={2,6,45,78,8};
        for(int i:a){
            System.out.println(i);
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The maximum element is: "+max);
    }
}