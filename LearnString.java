package learnString;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnString {
	
	public static void main(String[] args) {
		
		// 1. Write a program to reverse a given string? 
		// intput String txt = "Welcome";
		// output---> emocleW
		
		
		// 2. Write a program to print next Char of given String?
		// input String txt = "A1B2C3";
		// output             "B2C3D4"
		
		// Way 1:
		String txt = "welcome to Testleaf";   // literal
		String txt1 = "ver 2.0";
		int ph = 12345;
		
	//	System.out.println(txt);
		
		
		// Way 2: 
	//	String obj = new String("Testleaf"); // Object
	//	System.out.println(obj);
		
		
		
		// Count of String
		int count = txt.length();
		System.out.println(count);
		
		//charAt()
		char ch = txt.charAt(3);
		System.out.println(ch);
		
		int indexNum = txt.indexOf('s');
		System.out.println(indexNum);
		
		int lastIndexOf = txt.lastIndexOf('s');
		System.out.println(lastIndexOf);
		
		String trim = txt.trim();
		System.out.println(trim);
		
		
		System.out.println(txt.concat(txt1));
	//	System.out.println(txt + txt1);
		
		
		System.out.println(txt + ph);
		
		
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
		
		char[] charArray = txt.toCharArray();
		System.out.println(charArray[7]);
		
		String[] split = txt.split(" ");
		System.out.println(split[2]);
		
		String substring = txt.substring(15);
		System.out.println(substring);
		
		
		String substring2 = txt.substring(15, txt.length()-1);
		System.out.println(substring2);
		
		System.out.println(txt1.equals("Ver 2.0"));
		
		System.out.println(txt1.equalsIgnoreCase("Ver 2.0"));
		
		System.out.println(txt1.startsWith("ve"));
		
		System.out.println(txt1.endsWith("0"));
		
		System.out.println(txt1.replace('v', 'V'));
		
		txt1.replace("come", "go");
		
		
		
		
		
		
		
		
		
		
		
	}

}
