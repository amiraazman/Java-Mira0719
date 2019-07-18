class While{
	public static void main(String args[]){
		//foreach loop

		int out = 1;
			while (out < 3){
				int inner = 5;
					while(inner < 8){
						System.out.println(out + " " + inner);
						inner++;
					}
					out++;
			}
			
	}
}