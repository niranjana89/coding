package com.learning.concepts.java.annotations;


public class DemoAnnotation {

	@Test
	public void showOnTrue(){
		if(true) throw new RuntimeException();
	}
	
	@Test
	public void showOnFalse(){
		if(false) throw new RuntimeException();
	}
	
	@Test(enabled = false)
	public void print(){
		if(true) System.out.println("helloo");
	}
	
}
