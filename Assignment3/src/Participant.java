


public class Participant extends Guitar{
	String firstName;
	String lastName;
	String race;
	double sessionTime;
	double price;
	


public Participant (String firstName, String lastName,String race,double sessionTime) {
	this.firstName=firstName;
	this.lastName = lastName;
	this.race = race;
	this.sessionTime = sessionTime;
	
	}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
	
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}


public void setRace(String race) {
	this.race = race;
}

public String getRace() {
	return race;
}

public void setSessionTime(double sessionTime) {
	this.sessionTime = sessionTime;
}

public double getSessionTime() {
	return sessionTime;
}

public void setPrice() {
	this.price = price;
}

public double getPrice() {
	return 10*sessionTime;
}
public String toString() {
	return firstName + lastName;
}

}
