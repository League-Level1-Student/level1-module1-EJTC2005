package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
	JPanel panel = new JPanel();

BinaryConverter(){
	panel.add(label);
	panel.add(answer);
	panel.add(button);
	button.addMouseListener(null);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
public static void main(String[]Args){
BinaryConverter bin = new BinaryConverter();
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
}
