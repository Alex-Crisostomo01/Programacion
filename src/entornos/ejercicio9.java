package entornos;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPrime(3);
		System.out.println("¿Es primo? " + result);
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {
				return true; // Error: Debería ser número % i != 0
			}
			return false;
		}
		return false;
	}
}
