public class oopsPractice_polymorphism extends F{
	
	/*
	 * polymprphism means same action done in different ways 
	 * 1.compile time polymorphism 2.run time polymorphism
	 * ✅ Why "Compile-time"?
	 * Because the method call is resolved during compilation.
	 * The compiler decides which method version to call based on the number and type of parameters.
	 * 
	 * ✅ Why "Run-time"?
	 * It's called runtime polymorphism because the method that gets executed is determined during the execution of the program 
	 */
	
	
	//method overloading
	public int add(int a, int b) {
		return a+b;
		
	}
	//same method but different parameters..this is called method overloading
	public int add(int a, int b, int c) {
		return a+b;
		
	}
	
	//method overriding means changing implementation of another method with same name,same parameters..
	//this can be done when 2 methods in 2 different classes
	//should extend the parent class
	@Override
	void add() {
		System.out.println("Method");
	}

}
class F{
	void add() {
		System.out.println("Method");
	}
}

/*
 * abstract class is similar to class but
 * it can have absract methods..and normal methods also
 * 0-100% abstraction
 * abstraction means hiding implementation of method
 */
abstract class ni{
	
	abstract void meth7();
	void meth4() {
		System.out.println("Normal Method");
	}
	
}
