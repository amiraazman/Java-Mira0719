package com.miraazman.sample;

import java.util.*;

public class UtilCheck {
	
	public static void main(String args[]){
		
		/*Non Generic need typecasting
		List list = new ArrayList();
		
		list.add("Hello");
		
		telling compiler that we know it's a string
		String s = (String)list.get(0);
		*/
		
		//Generic
		List <String> list = new ArrayList <String>();
		
		//Add elements into "list" array
		list.add("Hello!"); //[0]
		//list.add(new FinalClass());
		list.add("Hello I am Baymax."); //[1]
		list.add("Your Personal Healthcare Taker."); //[2]
		list.add("Nice to meet u Baymax!");  //[3]
		
		//String s = list.get(0);
		
		/*print all elements in "list" array
		for (String s : list){
		
		//System.out.println("I got: " + s);
			System.out.print(s + " ");
		
		} 
		*/
		
		/*
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			
			System.out.print(it.next() + " ");
		}
		*/
		
		for(Iterator<?> it = list.iterator(); it.hasNext();){
			
			String s = (String) it.next();
			
			if(s.equals("Mira"))
				System.out.println("I got: " + s);
			
			//check if there is any values
			//if (it.next())
		}
	}
}
