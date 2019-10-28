package _06_duck;



public class duckRunner {
	public static void main(String[] Args){
		Duck pato = new Duck("waffles",6);
		pato.quack();
		Lion leo = new Lion("meat",4);
		leo.roar();
		leo.chase();
	}
}

