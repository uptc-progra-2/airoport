package co.uptc.edu.airplan.model;

public class User {
	private String firstName;
	private String lastName;
	private String greet;
	private int randomNumber;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String greet, int randomNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.greet = greet;
		this.randomNumber = randomNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
}
