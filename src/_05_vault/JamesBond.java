package _05_vault;

public class JamesBond {
int findCode(Vault vault ){
	for(int x=0; x<1000001; x++){
		 if(vault.tryCode(x) == true){
			 return x;
		 }
		 
		 
		 
	}
	return -1;
}
	
	
public static void main(String []Args){
	JamesBond jamesbond = new JamesBond();
	Vault vault = new Vault();
	System.out.println(jamesbond.findCode(vault));
}
	
	
}
