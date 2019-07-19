package com.mira.sample;

public class OuterClass {
	
	int num;
	
		//inner class
		private class InnerClass{
				public void print(){
					System.out.println("This is an inner class");
				}
		}
		public class InnerClass2{
				public void print(){
				System.out.println("This is an inner class2");
			}
		
		}
		//access inner from inner method
		void displayInner(){
			InnerClass inner = new InnerClass();
			inner.print();
		}

	}

