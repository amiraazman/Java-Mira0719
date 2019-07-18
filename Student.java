/* 
	student info
*/

public class Student{
	public static void main(String args[]){

		//System.out.println("Enter Name: " + args[0] + "Enter Address: " + args[1] + "Enter Age: " + args[2]);

		StudentDetails S1 = new StudentDetails();

		S1.setDetails(args[0], args[1], Short.parseShort(args[2]));
		S1.getDetails();
		

	}
}

class StudentDetails{
		String StudName;
		String StudAddress;
		short StudAge;

		void setDetails(String StName, String StAdd, short StAge){
			StudName = StName ;
			StudAddress = StAdd;
			StudAge = StAge;
		}

		void getDetails(){
			System.out.println("Student Name: " + StudName + "\nStudent Address: " + StudAddress + "\nStudent Age: " + StudAge);
		}

}