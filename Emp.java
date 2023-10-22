package c209L02S1;

public class Emp {
private int id;
private double salary;
private char gender;
private String email;
/*public Emp(int id, double salary, char gender, String email) {
	super();
	this.id = id;
	this.salary = salary;
	this.gender = gender;
	this.email = email;
}*/
public Emp(int id2, double salary2, String email2, char gender2) {
	// TODO Auto-generated constructor stub
	id=id2;
	salary=salary2;
	email=email2;
	gender=gender2;
}
public int getId() {
	return id;
}

public double getSalary() {
	return salary;
}

public char getGender() {
	return gender;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
