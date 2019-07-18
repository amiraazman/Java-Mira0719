public class GrandChild extends Child{
	public Child(){
		super();
	}

	public GrandChild(String str1, String str2){
		super(str1,str2);
	}

	@override
	public void testIt(){
		System.out.println("Testing in GrandChild");
	}
}
