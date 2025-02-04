public class Array{
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=2;
        a[1]=4;
        a[2]=6;
        a[3]=8;
        a[4]=10;
        for(int h:a){
            System.out.println(h);
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
        }
        System.out.println("Sum of array elements : "+sum);
    }
}