package com.p1;

public class Sample {

	public void eat(String name)
	{
		System.out.println("Sathya eat " +name);
	}
	public void sleep(String name)
	{
		System.out.println("Sathya sleep with" +name);
	}
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.eat("manusan pee");
		s.eat("Maatu pee");
		s.eat("Naai pee");
		s.eat("Kalutha pee");
		s.sleep("Desi girls");
		
	}
}
