class A{
	void callMe(){
		System.out.println("This is class A");
	}
}

class B extends A{
	void callMe(){
		System.out.println("This is class B");
	}
}

class C extends A{
	void callMe(){
		System.out.println("This is class C");
	}
}

public class OverRIDE{
	public static void main(String args[]){
		A a = new A();
		a.callMe();
		B b = new B();
		b.callMe();
		C c = new C();
		c.callMe();

		A ref = new A();
		ref = b;
		ref.callMe();

		ref = c;
		ref.callMe();

		ref = a;
		ref.callMe();
	}
}