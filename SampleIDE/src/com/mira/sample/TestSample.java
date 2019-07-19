package com.mira.sample;

public class TestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleA obj1 = new SampleA();
		SampleB obj2 = new SampleB();
		
		System.out.println("");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName =  new String(obj1.toString());
		System.out.println("strObjName" + strObjName);
		
		if(strObjName.equals = "SampleA"){
			System.out.println("This is SampleA");
			
		} else{
			
			System.out.println("This is not sampleA");
		}
	}

}
