class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int length=0;
    void append(T x){
        A[length++]=x;
    }
    void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class genericsDemo2{
    public static void main(String args[]){
        MyArray obj=new MyArray();
        obj.append("Hari");
        obj.append(45);
        obj.append("Choppa");
        obj.display();
    }
}
