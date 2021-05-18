package com.p1;

public class Sample {

	public void eat(String name)
	{
		System.out.println("Sathya eat " +name);
	}
	public void sleep()
	{
		System.out.println("Sathya sleep with desi girls");
	}
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.eat("manusan");
		s.eat("Maatu");
		s.eat("Naai");
		s.eat("Kalutha");
		s.sleep();
		
	}
}
