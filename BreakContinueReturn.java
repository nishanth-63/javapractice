public class BreakContinueReturn {
	
	public static void main(String[] args) {
		
	
	//break
	//in the below program if i is 5 then entire loop will stop
	for(int i=1;i<11;i++) {
		if(i==5) {
			break;
		}
		System.out.println(i);
		
	}
	
	//continue
	//if i is 5 then it will skip 5 remaining will be printed
	for(int i=1;i<11;i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i);
	}
	
        //return
		//it is used to exit the method
		// code next to it will not execute
		if(5<7) {
			return;
		}
		//this will not execute
		System.out.println("End of the program");
		
	
	}

}
