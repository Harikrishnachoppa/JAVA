class Outer {
    int h=10;
    Inner innerobj=new Inner();
    class Inner{
        int k=20;
        public void innerdisplay(){
            System.out.println(h+" "+k);

        }
        public void innersum(){
            int a=h+k;
            System.out.println("Sum = "+a);
        }
    }
    public void outerdisplay(){
       // Inner innerobj=new Inner();
        innerobj.innerdisplay();
        System.out.println("The value of k= "+innerobj.k);
        innerobj.innersum();
    }
   
}
class NestedInner{
    public static void main(String args[]){
    Outer obj=new Outer();
    obj.outerdisplay();
}
}