import java.util.Scanner;
public class MaxEleinArray{
    static int max(int A[]){
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
       
       int r= max(arr);
       System.out.println("Maximum element is "+r);
    }
}