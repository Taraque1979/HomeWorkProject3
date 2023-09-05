package hw5JavaVariables;

import org.jcp.xml.dsig.internal.dom.DOMReference;
//Object is created in main method & so on Constructor is initialized:
//variables are initialized:
// method is initialized:

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe taraque = new AboutMe();
		taraque.name = "Taraque Shams Tarafdar";
		taraque.age = 43;
		taraque.gender = 'M';
		taraque.height = 5.11f;
		taraque.land = 2335.3265;
		taraque.salary = 3200;
		taraque.assests = 23256565465l;
		taraque.uscitizen = true;
		taraque.aboutme();

		System.out.println("--------------------------");
		AboutMe robert = new AboutMe();
		robert.name = "Robert D'soza";
		robert.age = 45;
		robert.gender = 'M';
		robert.height = 6.01f;
		robert.land = 256444.3326;
		robert.salary = 3100;
		robert.assests = 323565644544l;
		robert.uscitizen = false;
		robert.aboutme();

	}

}
