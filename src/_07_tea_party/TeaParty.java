package _07_tea_party;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		if (isKnighted == false) {

			if (isWoman == true) {
				return "Hello " + "Ms. " + name;
			}
			
		}

		if (isKnighted == false) {

			if (isWoman == false) {
				return "Hello " + "Mr. " + name;
			}
			
		}

		if (isKnighted == true) {

			if (isWoman == false) {
				return "Hello " + "Sir " + name;	
			}
			
		}

		if (isKnighted == true) {

			if (isWoman == true) {
				return "Hello " + "Lady " + name;
			}
			
		}

		// TODO Auto-generated method stub
		return null;

	}

}
