package glabEncapsulation;

public class Student {
private int studentID;
private String firstName;
private String lastName;
private String studentEmail;
private long studentPhone;

public Student() {
	
	studentID=0;
	firstName="";
	studentEmail="";
	studentPhone=0;
}

public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getStudentEmail() {
	return studentEmail;
}

public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}

public long getStudentPhone() {
	return studentPhone;
}

public void setStudentPhone(long studentPhone) {
	this.studentPhone = studentPhone;
}

public Student(int studentID, String firstName, String lastName, String student, long studentPhone) {
	this.studentID=studentID;
	
}
}
