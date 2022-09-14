package dev.jacot.models;

public class ImprovCharacter 
{
	private int id;
	private String firstName;
	private String lastName;
	private String typeOfCharacter;
	
	public ImprovCharacter()
	{
		
	}
	
	public ImprovCharacter(int id, String firstName, String lastName, String typeOfCharacter)
	{
		this.id = id;
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.typeOfCharacter = typeOfCharacter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTypeOfCharacter() {
		return typeOfCharacter;
	}

	public void setTypeOfCharacter(String typeOfCharacter) {
		this.typeOfCharacter = typeOfCharacter;
	}

	@Override
	public String toString() {
		return "ImprovCharacter [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", typeOfCharacter=" + typeOfCharacter + "]";
	}
	
	
	

}
