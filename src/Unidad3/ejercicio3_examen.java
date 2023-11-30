package Unidad3;

import java.util.Scanner;

public class ejercicio3_examen {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		// TODO Auto-generated method stub
		// algoritmo que pida dos numeros entre 0 - 100 y que no son iguales 
		// definicion de variables 
		// si el primer numero (A) es menor que el segundo (B) Se muestran todos los numeros que hay entre A hasta B 
		// en orden creciente 
		int A;
		int B ;
		
		do {
			System.out.println("Introduce el primer valor");
			 A = entrada.nextInt();
			System.out.println("Introduce el segundo valor");
			 B = entrada.nextInt();
		}while (A > 100 || A < 0 || B  > 100 || B < 0 || A == B);
		if (A < B) {
			for (int i = A; i <= B; i++) {
				System.out.print(i + " ");
			}
		}
		else { 
			for (int i = A; i >=B ; i--) {
				System.out.print(i + " ");
			}
		}
		
	}
}


