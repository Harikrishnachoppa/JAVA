interface MyNumber{
void Fun(int x);
}
class Test{
public static void main(String args[]){
MyNumber mn=(int x)->System.out.println(x*x*x);
mn.Fun(3);
}
}