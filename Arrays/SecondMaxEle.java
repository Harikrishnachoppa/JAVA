import java.util.Scanner;
public class SecondMaxEle{
    public static void main(String args[]){
        int a[]={2,50,45,78,8};
        for(int i:a){
            System.out.println(i);
        }
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }

        }
        System.out.println("The  second maximum element is "+max2);
    }
}