class data<T>{
    private T obj;
    public void setdata(T t){
        obj=t;

    }
    public T getdata(){
        return obj;
    }
}
public class genericsDemo{
    public static void main(String args[]){
        data<String> d=new data<>();
        d.setdata("Hello");
        System.out.println(d.getdata());
    }

}