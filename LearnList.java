package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		/*
		 * 1) From package: Java.util.List
		 * 2) List is an interface
		 * 3) It is Child Interface of Collection
		 * 4) Generics > Introduced in Java 1.5, 
		 * 5) Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
		 * 
		 */

		// I do not know how many data i would have?
		String[] data = new String[30];
		// 5 data -> what will be value of other 25 -> null 

		// Great, if I can expand or shrink depends on the need !! 

		/*
		 * Characteristics:
		 * 
		 * 1) Duplicate values allowed
		 * 2) First In -> First Out (Order is maintained) 
		 * 
		 */

		//List<String> shoes = new ArrayList<String>();
		List<String> shoes = new ArrayList<String>();
		
		shoes.add("Reebok");
		shoes.add("Nike");
		shoes.add("Puma");
		shoes.add("Nike");
		
		// Logic to sort the List
		Collections.sort(shoes);
		
		System.out.println(shoes.size());
		//System.out.println(shoes.get(0));
		for (String eachShoe : shoes) {
			System.out.println(eachShoe);
		}
		
		
		

	}














}
