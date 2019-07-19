package com.mira.sample;

public class MyClass {
	
	public void displayMessage(Message m){
		
		System.out.println(m.greet());
	}
	
	public static void main(String args[]){
		//outer class
		OuterClass outer =  new OuterClass();
		
		//access display from inner class
		outer.displayInner();
		
		OuterClass.InnerClass2 inner = outer.new InnerClass2();
		inner.print();
		
		//pass annonymous inner class as a parameter
		MyClass obj = new MyClass();
		obj.displayMessage(); 
	}
}
