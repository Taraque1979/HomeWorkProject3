package hw5Q1Constructor;

public class Computer {
	public String brand;
	public int model;
	public short price;
	public char grade;
	public Boolean madeinusa;

	// below default constructor is being declared:

	public Computer() {
		System.out.println("This is the default construction from the computer class");
	}

	public Computer(String brand, int model, int price, char grade, boolean madeinusa) {
		this.brand = brand;
		this.model = model;
		this.price = 30000;
		this.grade = grade;
		this.madeinusa = madeinusa;
		System.out.println("Brand name:" + brand + " \n Model:" + model + " \n Price:" + " \n Grade:" + grade
				+ " \n Made In USA:" + madeinusa);

	}
}
