
public class Static {
	int n = 10; // variabile di istanza
	static int count = 0; // variabile statica
	
	public Static() {
		count++;
	}
	
	public int getNumber() { // metodo di istanza
		return n;
	}
	
	public static int getCount() { // metodo statico
		return count;
	}
}
