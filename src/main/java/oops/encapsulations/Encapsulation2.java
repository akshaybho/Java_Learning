package oops.encapsulations;

public class Encapsulation2 {
	
	private String model;
	private int year;
	private double price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Encapsulation2 e = new Encapsulation2();
		e.setModel("Hyundai Verna");
		e.setYear(2023);
		e.setPrice(1600000);
		
		System.out.println("Your car name is = "+e.getModel());
		System.out.println("And the year is = "+e.getYear());
		System.out.println("On road price of the car is = "+e.getPrice());
	}

}
