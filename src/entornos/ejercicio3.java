package entornos;

public class ejercicio3 {
// valor de temp --> 
// valor de a --> 
// valor de b --> 
	public static void main(String[] args) {
		
		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + ", " + b);

		for (int i = 2; i < n; i++) {
			int temp = a + b;
			System.out.print(", " + temp);
			a = b;
			b = temp;
		}
	}

}
