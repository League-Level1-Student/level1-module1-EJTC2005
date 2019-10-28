package _06_duck;

import javax.swing.JOptionPane;

public class Duck {

int numberOfFriends = 6;
String favoriteFood = "waffles";
void quack(){
	JOptionPane.showMessageDialog(null, "QUACK");
}
void waddle(){
	JOptionPane.showMessageDialog(null, "The duck is waddling towards you");
}

Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}

}
