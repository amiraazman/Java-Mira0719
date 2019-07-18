class ParentInstance{
	
	public static void main(String args[]){
		System.out.print("Hello and Welcome to instance!");

		Parent p1 = new Child();
		ChildB p2 = new ChildB("java", "avaj");
		ChildC p3 = new ChildC("java c", "avaj");
		Child p4 = new GrandChild("java grand ", "avaj");

		System.out.println("p1 name is" + p1.getName());
		p1.testIt();
		System.out.println("p2 name is" + p2.getName());
		p2.testIt();
		System.out.println("p3 name is" + p3.getName());
		p3.testIt();
		System.out.println("p3 name is" + p3.getName());
		p4.testIt();
	}
}