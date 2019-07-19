package com.mira.sample;

public class FinalRunner{
	
	public static void main(String[] args){
		//FinalClass.sayHi("Mira");
		
		FinalClass obj = new FinalClass();
		obj.sayHi("Mira");
		obj.sayBye("To you");
		System.out.println(obj.className);
		System.out.println(obj.className2);
		obj.className = "My class";
		obj.className2 = "My class 2";
		System.out.println(obj.className);
		System.out.println(obj.className2);
		
		
	}
	
	
}
