public class CopyOfArrays{
    public static void main(String args[]){
        int []a={2,4,6,8,10,12};
        int []b=new int[a.length];
        System.out.println("Lenght of a="+a.length);
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;
        System.out.println("Lenght of a="+a.length);

        for(int c:b){
            System.out.println(c);
        }
        
    }
}