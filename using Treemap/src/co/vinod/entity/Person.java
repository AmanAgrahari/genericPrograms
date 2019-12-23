package co.vinod.entity;

public class Person implements Comparable<Person> {

	private String firstname;
	private String lastname;
public Person(){
	
}
public Person(String firstname, String lastname) {
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
	return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
}
@Override
public int compareTo(Person other) {
	// TODO Auto-generated method stub
	int ret=this.firstname.compareTo(other.firstname);
	if(ret==0)
	{
		 ret=this.lastname.compareTo(other.lastname);
	}
		 return ret;
}

}

