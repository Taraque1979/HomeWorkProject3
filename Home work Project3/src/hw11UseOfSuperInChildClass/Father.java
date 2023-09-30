package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean uscitizen;
	public String familyname;

	public Father() {
		System.out.println("This is a default constructor from parent class Father");

	}

	public Father(String name, int age, char sex, boolean uscitizen, String familyname) {
		this. name=name;
		this.age=age;
		this.sex=sex;
		this.uscitizen=uscitizen;
		this.familyname=familyname;
		System.out.println("From parent class: \nName: " + name +" ,Age:" + age + " ,Gender:" + sex + ", U.S.Citizen:"
				+ uscitizen + " ,Familyname:" + familyname+" .");

	}

	
	public void father() {
		System.out.println("This is a default method");
		
	}

public void fatherinfo(String name, int age, char sex, boolean uscitizen, String familyname) {
	System.out.println("From parent class: \nName: " + name +" ,Age:" + age + " ,Gender:" + sex + ", U.S.Citizen:"
			+ uscitizen + " ,Familyname:" + familyname+" .");
	
}

















}
