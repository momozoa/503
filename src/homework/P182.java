package homework;
class Student182 {
	
	public static int serialNum = 1000;
	int StudentID;
	String StudentName;
	int grade;
	String address;
	

	public String getStudentName(){
		return StudentName;
	}
	
	public void setStudentName(String name){
		StudentName = name;
	}
}
public class P182 {

	public static void main(String[] args) {

		Student182 StudentLee = new Student182();
		StudentLee.setStudentName("이지원");
		System.out.println(StudentLee.serialNum);
		StudentLee.serialNum++;
		
		Student182 StudentSon = new Student182();
		StudentSon.setStudentName("손수경");
		System.out.println(StudentSon.serialNum);
		System.out.println(StudentLee.serialNum);
	}

}
