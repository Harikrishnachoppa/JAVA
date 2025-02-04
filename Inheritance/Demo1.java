class A {
int i;
protected int j;
void showij() {
System.out.println("i= :"+i);
System.out.println("j= :"+j);
public int sum(){
return i+j;
}
}
}
class B extends A {
int k;
void showk() {
System.out.println("k= :"+k);
public int sum1(){
return sum()+k;
}
}
class Demo1 {
 public static void main(String args[]) {
B objb=new B();
objb.i=7;
objb.j=10;
objb.k=15;
objb.showij();
objb.showk();
obj.sum();
obj.sum1();
}
}