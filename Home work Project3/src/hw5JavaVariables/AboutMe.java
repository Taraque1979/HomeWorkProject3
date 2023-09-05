package hw5JavaVariables;

//Below variables are declared:

public class AboutMe {
	String name;
	int age;
	char gender;
	float height;
	double land;
	short salary;
	long assests;
	boolean uscitizen;

	// Below Constructor is declared:

	public AboutMe() {
		System.out.println("This is all about Us");
	}

	// Below method is implemented

	public void aboutme() {
		System.out.println("\n Name:" + name + "\n Age:" + age + "\n Gender:" + gender + "\n Height:" + height + "\n Land:"
				+ land + "\n Salary:" + salary + "\n Assests:" + assests + "\n US citizen:" + uscitizen);

	}

}
