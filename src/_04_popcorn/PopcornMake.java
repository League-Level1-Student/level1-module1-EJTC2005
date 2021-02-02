package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMake {

	
	
	
	
	public static void main(String[]Args){
		String x = JOptionPane.showInputDialog("What flavor do you want?");
		String y = JOptionPane.showInputDialog("How long do we microwave it?");
		int p = Integer.parseInt(y);
		Popcorn pop = new Popcorn(x);
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(p);
		micro.startMicrowave();
		
	}
}
