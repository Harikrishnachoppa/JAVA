public class VariableArguments{
    static void show(int count,String ...A){
      for(int i=0;i<A.length;i++){
        System.out.println(count+"."+A[i]);
        count++;
      }
    }
    public static void main(String args[]){

        show(5,"Hari","ROhit","Kusuma","Dileep");

    }
}