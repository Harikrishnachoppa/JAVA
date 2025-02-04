class Outer {
static class Inner {
void callMe(){
System.out.println("I am  nested Static class method");
}

}
public static void main(String args[]){
Outer.Inner t=new Outer.Inner();
t.callMe();
}
}