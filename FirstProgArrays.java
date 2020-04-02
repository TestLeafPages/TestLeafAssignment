package week1.day4;

import java.util.Scanner;

public class FirstProgArrays {
	
	public static void main(String[] args) {
		
		// Assignment 1:- Find the min and max number of given array?
		// input -> int[]a = {200, 500, 10, 3000};
		
		// Assignment 2:- Find the index number of the given item from given array?
		// input -> int[]a = {200, 500, 10, 3000};
		
		//		int[] a = new int[-1];  --------> throws "NegativeArraySizeException"
		//		System.out.println(a.length);
		
//********************************************************	
		
		// Scanner
		
		// Write a program to find average of given array?
		int[] a = {10, 40, 70, 100};
		
		int count  = a.length;
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		int avg = sum/count;
		System.out.println(avg);
		
//********************************************************
		// Find the min and max number of given array?
		int[] b = {200, 500, 10, 3000};
		
		int min = b[0];
		int max = b[0];
		
		for (int i = 0; i < b.length; i++) {
			
			if(b[i] < min) {
				min = b[i];
			}
			if(b[i] > max) {
				max = b[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
//********************************************************
		
		//Find the index number of the given item from given array?
		int[] c = {200, 500, 10, 3000, 10, 10};
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i] == 10) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
