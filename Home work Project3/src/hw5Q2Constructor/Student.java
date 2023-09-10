package hw5Q2Constructor;

public class Student {
	public String studentname;
	public int studentid;
	public char studentgender;
	public float studentgrade;
	public boolean isprogrammer;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class.");

	}

	public Student(String studentname, int studentid, char studentgender, float studentgrade, boolean isprogrammer) {
		this.studentname = studentname;
		this.studentid = studentid;
		this.studentgender = studentgender;
		this.studentgrade = studentgrade;
		this.isprogrammer = isprogrammer;

		System.out.println("Student name:" + studentname + "\nID:" + studentid + "\nGender:" + studentgender
				+ "\nGrade:" + studentgrade + "\nIs programmer:" + isprogrammer);
	}

}
