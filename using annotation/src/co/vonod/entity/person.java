package co.vonod.entity;

import co.vonod.annotations.info;

@info(name = "vinod kumar",email="rocks@gmail.com")
public class person {
	private String firstname,lastname; 

	public person(){
		
	}

	public person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
