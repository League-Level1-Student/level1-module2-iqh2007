package _06_minion;

public class Minion {

	private String name;

	private int eyes;

	private String color;

	private String master;

	Minion(String name, int eyes, String color, String master) {

		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	String getName() {
		return name;

	}

	int getEyes() {
		return eyes;

	}

	String getColor() {
		return color;

	}

	String getMaster() {
		return master;

	}

}
