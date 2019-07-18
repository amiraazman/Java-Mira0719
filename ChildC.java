public class ChildC extends Parent{
	public Child(){
		super();
	}

	public Child(String str1, String str2){
		super(str1,str2);
	}

	@override
	public void testIt(){
		System.out.println("Testing in Child");
	}
}
