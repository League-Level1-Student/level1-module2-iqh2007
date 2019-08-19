package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {

		TeaBag t1 = new TeaBag(TeaBag.PASSION_FRUIT);
		
		Kettle k1 = new Kettle();
		
		k1.boil();
		
		Cup c1 = new Cup();
		
	    c1.makeTea(t1, k1.getWater());
	}
}
