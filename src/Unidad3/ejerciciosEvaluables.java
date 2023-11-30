package Unidad3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejerciciosEvaluables {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// leer 5 numeros por pantalla 
		final int TAM = 5;
		double[] num = new double[TAM];
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce 5 numero");
			num[i] = entrada.nextInt();
		}
		double suma = sumarElementos(num);
		System.out.println("La suma de los numeros es " + suma);
		double[] invertida = invertirArray(num);
		for (int i= 0 ; i< TAM; i++)
			System.out.println(invertida);
		
		 

	}

// Calcula la suma de todos los elementos en un array 
	public static double sumarElementos(double[] array) {
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;
	}

// Calcular la array invertida 
	public static double[] invertirArray(double[] array) {
		double[] arrayInv = new double[array.length];
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			arrayInv[i] = array[j];
			j--;
		}
		return arrayInv;
	}

}
