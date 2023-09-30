package hw11UseOfSuperInChildClass;

public class TestFamilyClass {

	public static void main(String[] args) {
		System.out.println("---------------default constructor intialized from parent class Father-----------------");

		Father fatherA = new Father();

		System.out
				.println("\n---------------parameterized constructor intialized from parent class Father---------------");
		
		Father fatherB = new Father("Abdur Rouf", 72, 'M', true, "Tarafdar");
		
		System.out.println("\n-------------default method intialized from parent class Father------------------");
		fatherB.father();

	    System.out.println("\n-------------parameterized method intialized from parent class Father------------------");
	    fatherB.fatherinfo("Abdur Rouf", 72, 'M', true, "Tarafdar");
	
	
	    System.out.println("\n---------****default constructor intialized from child class daughter***-----------");
	    Daughter daughter1=new Daughter();
	    
	    System.out
		.println("\n----------****parameterized constructor intialized from child class Daughter****---------------");
	    Daughter daughter2=new Daughter();
	    
	    System.out.println("\n-------------default method intialized from child class Daughter------------------");
		daughter2.daughter();
		
		 System.out.println("\n-------------parameterized method intialized from child class daughter------------------");
		 daughter2.daughterinfo("February", 25);

	    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}






















}

