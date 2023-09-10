package hw4JavaVariablesInitialized;

// When an object [aboutme]is created in a class[AboutMe] Constructor is initiated,
// When an object is created from a class, the class is instantiated
// Calling all the variables
// Next line, we printed all the outcome with String Concatenation
public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println("My Name:" + aboutme.myName + "\n My age:" + aboutme.myAge + "\n My yearly salary:"
				+ aboutme.yearlySalary + "\n My Asest value:" + aboutme.myTotalAssestValue + "\n US citizen:"
				+ aboutme.usCitizen + "\n Gender:" + aboutme.Gender + "\n room Measurment:" + aboutme.roomMeasure
				+ "\n My Height:" + aboutme.myheight);

		// TODO Auto-generated method stub

	}

}
