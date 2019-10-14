package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMake {

	
	
	
	
	public static void main(String[]Args){
		Popcorn pop = new Popcorn("plain");
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(5);
		micro.startMicrowave();
	}
}
