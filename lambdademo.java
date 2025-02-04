interface mylambda{
    public void display(int A[]);
}
public class lambdademo{
    public static void main(String args[]){
        mylambda lb=
        (s)->
        {
            for(int i=0;i<s.length;i++){
                System.out.println(s[i]);
            }
        };
        int arr[]={2,4,6,8};
        lb.display(arr);
    }
}