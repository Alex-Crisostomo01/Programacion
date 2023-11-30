package entornos;

public class ejercicio1 {
// n 5
// sum 0 - 1 - 3 - 6 10 15
// pantalla --> 15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);

	}

}
