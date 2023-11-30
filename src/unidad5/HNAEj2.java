package unidad5;

import java.util.Random;

public class HNAEj2 {

	public static void main(String[] args) {
		Random tirada = new Random();
		int dado1 = tirada.nextInt(6)+1;
		int dado2 = tirada.nextInt(6)+1;
		int dado3 = tirada.nextInt(6)+1;
		int suma = dado1 + dado2 + dado3;
		System.out.println("Dado 1 ");
		System.out.println(dado1);
		System.out.println("dado2");
		System.out.println(dado2);
		System.out.println("dado3");
		System.out.println(dado3);
		System.out.println("suma de los dados");
		System.out.println(suma);
	}

}
