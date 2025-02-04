public class Method5 {
    static int sum(int ...A){
        int sum = 0; // Declare sum variable to store the sum
        for(int i=0;i<A.length;i++){
            sum = sum + A[i]; // Corrected usage of sum variable
        }
        return sum;
    }
    public static void main(String args[]){
       System.out.println(sum(1,2,3,4,5));
       System.out.println(sum(4,3,2,6));
    }
}
