package week1.day2;

public class Math {
	
	/*
	 * Methods
	 * 
	 * Add
	 * Multiply
	 * Divison
	 * Sub
	 * 
	 */
	
	// Method Syntax (Signature):
	// 1) access modifier -> public, private, protected, default (package) 
	// 2) return type (output) -> data type + void (does not return type)
	// 3) method name (write meaningful names) -> lower case
	// 4) arguments (input) -> DatType variable_name (optional) 
	
	// add method (4, 3) -> 7 
	public int add(int a, int b) {
		return a+b;
	}
	
	// public -> anyone can access
	// private -> access only within class
	// default -> access only within package
	// protected -> access -> within package + inherited
	
	int multiply(int a, int b) {
		return a*b;
	}
	
	static int division(int a, int b) {
		return a/b;
	}
	
	
	
	public static void main(String[] args) {
		
		// Step 1) Reference
		// ClassName ref = new ClassName();
		Math m = new Math();
		
		// Step 2) Call the method
		// ref.methodName();
		int add = m.add(3, 4);
		System.out.println(add);
		
		int multiply = m.multiply(3, 11);
		System.out.println(multiply);
	}
	
	
	
	
	
	
	
	
	
}
