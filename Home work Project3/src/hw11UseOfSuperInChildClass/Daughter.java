package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthmonth;
	public int age;
	
	public Daughter() {
		super( "Abdur Rouf",72,'M',true,"Tarafdar");
		super.father();
		super.fatherinfo("Abdur Rouf", 72, 'M', true, "Tarafdar");
		super.familyname="Tarafdar";
		System.out.println(" Father & Daughter share the Family name:"+ familyname);
		
		System.out.println("--------------This is a default constructor from child class Daughter------");
	}
	
	public Daughter(String birthmonth,int age) {
		this. birthmonth=birthmonth;
		this. age=age;
		System.out.println("From child class:\n Birth month:"+ birthmonth+"Age:"+age);
		
	}

public void daughter() {
	super.father();
	super.fatherinfo(name,age,sex,uscitizen,familyname);
	System.out.println("-------This is a default method from child class daughter--------");
	
}

public void daughterinfo(String birthmonth,int age) {
	System.out.println("From child class:\n Birth month:"+ birthmonth+"\nAge:"+age);
	
}




















}
