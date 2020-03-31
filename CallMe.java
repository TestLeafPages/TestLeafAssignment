package week1.day2;

public class CallMe {

	public static void main(String[] args) {
		
		Math m = new Math();
		int add = m.add(3, 4);
		System.out.println(add);
		
		int multiply = m.multiply(4, 8);
		System.out.println(multiply);
		
		// static method
		// ClassName.methodName();
		int division = Math.division(4, 1);
		System.out.println(division);
	}

}
