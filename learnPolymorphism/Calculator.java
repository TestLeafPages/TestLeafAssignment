package learnPolymorphism;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

		
		public static void main(String[] args) {
			
			LearnEncapsulation les = new LearnEncapsulation();
			String name = les.getName();
			System.out.println(name);
		
			
			les.setName("Hadoop");
			name = les.getName();
			System.out.println(name);
			
			
			
		}
		
	}
	
	/*
	 * public int add(int a) { return a; }
	 * 
	 * public String add(String txt) { return txt; }
	 */

	/*
	 * public int add(int a, int b) { 
	 * return a+b; }
	 * 
	 * public int add(int a, int b, int c) 
	 * { return a+b; }
	 */
