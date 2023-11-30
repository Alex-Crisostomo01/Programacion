package unidad4;

public class factRecursivo {

	
	public static void main(String[] args) {
		int fact = fact(6);
		System.out.println(fact);

	}
	public static int fact(int num ) {
		// caso base 
		if (num <= 1) {
			return 1;
		}
		// caso general
		return (num*fact(num -1));
	}

}
