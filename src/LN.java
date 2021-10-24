import java.util.Random;

import javax.swing.JOptionPane;

public class LN {
	
public static void main(String[] args) {
	Random ran = new Random ();
	String dog = "";
	for (int i = 0; i < 8; i++) {
		dog = dog+ran.nextInt(10099) +" ";
	}
	
	JOptionPane.showMessageDialog(null, dog);
	
	
}
}
