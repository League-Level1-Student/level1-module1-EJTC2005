package _07_binary_converter;

/*
 public class WhiteBoardMarker {

 private int inkLeft; 

 private String color;
public WhiteBoardMarker (int inkLeft, String color){
this.inkLeft=inkLeft;
this.color=color;




 }
 }
 
 
 
 
 
 
 
 
 main(){
 
 WhiteBoardMarker white = new WhiteBoardMarker(0,"red");
 }
 
 
 public class Car{
 	String model;
 	int milesPerGallon;
 	boolean hasSpareTire;

 	public Car(String model, int milesPerGallon, boolean hasSpareTire){
 	this.model=model;
 	this.milesPerGallon=milesPergallon;
 	this.hasSpareTire=hasSpareTire;
 	
 	}
 	main(){
 	Car c = new Car("EEEEEEEEEEEEEEEEEE",0,false);
 	}
 	
}
 
 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton("convert");
	JPanel panel = new JPanel();

BinaryConverter(){
	panel.add(answer);
	panel.add(button);
	panel.add(label);
	button.addActionListener(this);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}


String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
public static void main(String[]Args){
BinaryConverter bin = new BinaryConverter();
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	String x = answer.getText();
	String y = convert(x);
	label.setText(y);
	
}
}
