package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		String name1 = "Handy";

		Smurf s1 = new Smurf(name1);
		
		s1.eat();
		
		s1.getName();
		
		
		String name2 = "Smurfette";
		
		Smurf s2 = new Smurf(name2);
		
		s2.eat();
		
		s2.getName();
		
		s2.getHatColor();
		
		s2.isGirlOrBoy();
		
		
		String name3 = "Papa";
		
		Smurf s3 = new Smurf(name3);
		
		s3.eat();
		
		s3.getName();
		
		s3.getHatColor();
		
		s3.isGirlOrBoy();
	}
}
