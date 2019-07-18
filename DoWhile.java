class DoWhile{
	public static void main(String args[]){
		//foreach loop

		int out = 1;
			do{
				int inner = 5;
					while(inner < 8){
						System.out.println(out + " " + inner);
						inner++;
					}
					out++;
			}
			while (out < 3);
	}
}