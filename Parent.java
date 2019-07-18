public abstract class Parent{
	private String name;

	private String place;

	//constructor
	public Parent(){
		name = "not set";
		place = "not set";
		System.out.println("default constructor");
	}

	//parameterized constructor
	public Parent(String str1, String str2){
		name = str1;
		place = str2;
		System.out.println("parameterized constructor constructor");

	}

	public String getName(){
		return name;
	}

	public void setName(String str){
		name = str;
	}

	public String getPlace(){
		return place;
	}

	public void setPlace(String str){
		place = str;
	}

	public abstract void testIt();
}