public class StringPractice {
	
	public static void main(String[] args) {
		
		/*
		 * String-> immutable
		 * when you change the value for s it will create a new object and store in it 
		 * it wont be stored in same place
		 *
		 */
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);  // Output: Hello
		
		
		/*
		 * StringBuffer-> mutable
		 * when you change the value for s it wont create a new object and it will store in same object by erasing
		 * thread safe
		 * synchronised 
		 *
		 */
		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);  // Output: Hello World
		/*
		 * StringBuilder-> mutable
		 * when you change the value for s it wont create a new object and it will store in same object by erasing
		 * not thread safe
		 * not synchronised 
		 *
		 */
		
		
		StringBuilder sbl = new StringBuilder("Hello");
		sbl.append(" World");
		System.out.println(sbl);  // Output: Hello World



	}

}
