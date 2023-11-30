package entornos;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i % 2 == 0) {
				sum *= 2;
			}
			System.out.println("Valor de 'i': " + i);
			System.out.println("Valor de 'sum': " + sum);
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}
