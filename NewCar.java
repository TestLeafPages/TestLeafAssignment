package week1.day1;

public class NewCar {



	// age of car
	short carAge = 10;
	float age = 2.5f;
	double newAge = 10.234;

	// punctured 
	boolean isPuncture = true;

	// Brand Logo
	char brand = 'M';

	// Java -> Strict 
	// regNumber -> Variable Name (lower)
	// = -> Assignment operator
	// "TN22BU1000" -> value
	String regNumber = "TN22BU1000";
	// String -> Data type (Class)


	public static void main(String[] args) {

		// Printing a statement (syso)
		System.out.println("Good Start");

		// Call these variable from the main method

		// Syntax
		// 1) Create a reference for the class
		// ClassName nick = new ClassName();  
		NewCar car = new NewCar();

		// How do I call the variable?
		// Syntax
		// nick.variableName;
		char brand2 = car.brand;
		System.out.println(brand2);

		// Print the registration number
		String regNumber2 = car.regNumber;
		System.out.println(regNumber2);

	}

}