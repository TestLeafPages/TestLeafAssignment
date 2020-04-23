package learnInheritance;

public class CallBMW {
	
	public static void main(String[] args) {
		
		Vehicle vl = new Vehicle();
		vl.applyBreak();
		vl.soundHorn();
		
		
		Car cr = new Car();
		cr.FourWheelers();
		cr.applyBreak();
		cr.soundHorn();
		
		
		BMW b = new BMW();
		b.BMWDesign();
		b.FourWheelers();
		b.applyBreak();
		b.soundHorn();
		
		
	}

}
