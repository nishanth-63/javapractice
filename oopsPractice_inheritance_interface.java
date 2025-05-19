public class oopsPractice_inheritance_interface extends A{
	public static void main(String[] args) {
		A a=new A();
		//calling non static method
		a.meth();
		//calling static method
		A.method();
		B b=new B();
		b.meth();
		B.method();	
		
	}

}

class A{
	void meth() {
		System.out.println("Class A");
	}
	static void method() {
		System.out.println("Static method in Class A");
	}
	
}
class B extends C{
	@Override
	void meth() {
		System.out.println("Class B");
	}
	
	//static methods cannot be overriden
	static void method() {
		System.out.println("Static method in Class B");
	}
	
}
class C{
	void meth() {
		System.out.println("Class C");
	}
	static void method() {
		System.out.println("Static method in Class C");
	}
	
}


class interfaceCheck implements Z{
	//whenever implementing all abstract methods of interface should be overriden in the class

	@Override
	public void samplemeth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Z{
	void samplemeth();
	void hello();
	default void meth1() {
		System.out.println("Java 8 interface changes->default method");
	}
	static  void meth2() {
		System.out.println("Java 8 interface changes->static method");
	}
		
}