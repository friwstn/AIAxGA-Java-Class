package Assignment1;

public abstract class Person {
	
	String name;
	String address;
	

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		System.out.println("*******************");
		return "Name " + this.name + " " + this.address;
	}
	
	
}
