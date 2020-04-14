package week3.day1;

/*
 * Like a class
 * Interface (I) do not have implementation 
 * It has only method signature (abstract)
 * 100% abstract
 * I will design interface first supported with documentation
 * 
 */

public interface HouseDesign {
	
	/**
	 * @author Babu
	 * This method helps to choose common color for the building
	 * @param color - This is the color of the house in String format
	 * 
	 */
	public void chooseColor(String color);
	
	/*
	 * public (allowed), protected (NA), private (NA), default (allowed)
	 * 
	 */
	public void designBasement();
	
	/**
	 * @author Babu
	 * This method helps to find how many floors the house will
	 * @return int - Number of floors
	 * 
	 */
	public int getNumberOfFloors();

}
