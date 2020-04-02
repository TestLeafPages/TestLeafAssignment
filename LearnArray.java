package week1.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArray {
	
	// String txt = "babu";
	
	//1. In Java, Array is static Data Structure.
	//2. store collection items (homogenous)
	//3. Should be declare array size 
	
	
	public static void main(String[] args) {
		
		// way 1:
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		
		// for count
		System.out.println(a.length);
		int[] x = a.clone();
		System.out.println(x[0]);
		
//		
//		System.out.println(a.length);
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
			
		// way 2:
		int[] b = {700, 800, 300, 400};
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	System.out.println("***************");
		
		Arrays.sort(b);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	
	

}
