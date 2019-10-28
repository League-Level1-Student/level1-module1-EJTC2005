package _06_duck;

import javax.swing.JOptionPane;

public class Lion {

	int numberOfFriends = 4;

	String favoriteFood = "meat";
	
	void roar(){
		JOptionPane.showMessageDialog(null, "ROOAAR");{}
	}
	void chase(){
		JOptionPane.showMessageDialog(null, "The Lion is chasing you");{}
	}
	Lion(String favoriteFood, int numberOfFriends) {
	    this.favoriteFood = favoriteFood;
	    this.numberOfFriends = numberOfFriends;
	}
}
