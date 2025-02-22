package oops.encapsulations;

public class Encapsulation1 {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Encapsulation1 encap = new Encapsulation1();
		encap.setAge(28);
		System.out.println("My age is "+encap.getAge());
	}
	

}
