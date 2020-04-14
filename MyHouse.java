package week3.day1;

public class MyHouse {

	public static void main(String[] args) {

		// Call Interface
		
		// Can I create object for interface?
		// HouseDesign myHome = new HouseDesign();
		
		// Can I create object for abstract class?
		// PartialHouse myHome1 = new PartialHouse();
		
		// You cannot create object for Interface or Abstract class
		// Object can be created for Concrete Class / Normal Class
		FullHouse myHouse = new FullHouse();
		//myHouse.getNumberOfFloors();
		myHouse.carParking();
		// access all 4 methods -> 3 methods based on interface + 1 own method
		/*
		 * Scope Restriction
		 */
		HouseDesign myHouse1 = new FullHouse(); // Create object for Class
		myHouse1.designBasement();
		
		
		
		
		
		
		
		
	}

}
