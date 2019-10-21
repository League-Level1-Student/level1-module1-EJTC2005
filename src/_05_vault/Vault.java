package _05_vault;

import javax.swing.JOptionPane;

public class Vault {
	int secretCode = 576845;
	
 boolean tryCode(int x){
	 if(x == secretCode){
		 return true;
	 }
	 else{
		 return false;
	 }
	 
 }
 
 public static void main(String []Args){
	 Vault vault = new Vault();
	 System.out.println(vault.tryCode(576845));
 }
}
