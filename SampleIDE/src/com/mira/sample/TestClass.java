package com.mira.sample;

public class TestClass implements inf2 {	

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "I am testing";
	}	
	
	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test cat");
	}
	
	public static void main(String args[]){
		
		System.out.println("in main class");
		System.out.println(name);
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(test.name);
		System.out.println(inf2.name);
		
		inf2 obj = new TestClass();
		
		System.out.println(obj.whoAmI());
		obj.testIt();
		
	}
}
