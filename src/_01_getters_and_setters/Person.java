package _01_getters_and_setters;

public class Person {

	private String name;

	private String superpower;

	String getSuperpower() {

		return this.superpower;
	}

	String getName() {

		return this.name;
	}

	void setName(String name) {

		this.name = name;
	}

	void setSuperpower(String superpower) {

		this.superpower = superpower;

	}
	
	public String toString() {
		return(name +" has mad "+ superpower +" skills");
	}
}