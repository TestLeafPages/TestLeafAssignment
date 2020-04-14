package week3.day1;

public class FullHouse implements HouseDesign {

	public void chooseColor(String color) {
		System.out.println("Yellowish Gray");
	}

	public void designBasement() {
		System.out.println("Done");		
	}

	public int getNumberOfFloors() {
		return 2;
	}

	/*
	 * can have your own methods in addition what interface told you
	 */
	public void carParking() {
		System.out.println("Implement");
	}
	
}
