package com.mira.sample;

class TryContinue{
	public static void main(String args[]){
		
		int input = Integer.parseInt(args[0]);
		int target = 0;
		 //if number > 10, set number to 10


		/*if (input >10){
			target = 10;
		} else{
			target = input;
		}
		*/

		//target = (input >10) ? 10 : input;
		//replace if else

		//ContinueTriangle
		outer: for(int i=0; i <10; i++){

			for(int j=0; j < 10; j++){

				if(j>i){

					System.out.println("M");
					continue outer;

				}

				System.out.print(" " + (i * j));
			}
		}

		System.out.println();
	}
}