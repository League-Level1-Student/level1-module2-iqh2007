package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {

		SeaCreature s1 = new SeaCreature("spongebob");
		
		SeaCreature s2 = new SeaCreature("Patrick");
		
		SeaCreature s3 = new SeaCreature("Squidward");
		
		s1.laugh();
		
		s2.laugh();
		
		s3.laugh();
		
		s1.eat();
		
		s2.eat();
		
		s3.eat();
		
	}
}
