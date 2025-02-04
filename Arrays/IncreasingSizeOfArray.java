public class IncreasingSizeOfArray{
    public static void main(String args[]){
        int []a={8,6,10,9,2};
        int []b=new int[2*a.length];
        System.out.println("The length of A : "+a.length);
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;

        System.out.println("The length of A: "+a.length);
        
    }
}