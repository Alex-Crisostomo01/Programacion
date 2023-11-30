package Unidad3;

import java.util.Scanner;

public class Calculadora_Funciones2 {
	// variables globales
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// declaramos variables locales de la función main
		char opcion = ' ';
		double op1 = 0;
		double op2 = 0;
		double rsdo = 0;
		// bucle del menú
		do {
			mostrar_menu();
			opcion = entrada.nextLine().charAt(0);
			switch (opcion) {
			case 's': // suma
			case 'S':
				System.out.println("Introduce numero 1");
				op1 = entrada.nextDouble();
				System.out.println("Introduce numero 2");
				op2 = entrada.nextDouble();
				entrada.nextLine();
				rsdo = suma(op1, op2);
				System.out.println(rsdo);
				break;
			case 'r': // resta
			case 'R':
				System.out.println("Introduce numero 1");
				op1 = entrada.nextDouble();
				System.out.println("Introduce numero 2");
				op2 = entrada.nextDouble();
				entrada.nextLine();
				rsdo = resta(op1, op2);
				System.out.println(rsdo);
				break;
			case 'm': // multiplicacion
				System.out.println("Introduce numero 1");
				op1 = entrada.nextDouble();
				System.out.println("Introduce numero 2");
				op2 = entrada.nextDouble();
				entrada.nextLine();
				rsdo = multiplicacion(op1, op2);
				System.out.println(rsdo);
				break;
			case 'd': // división
			case 'D':
				System.out.println("Introduce numero 1");
				op1 = entrada.nextDouble();
				do {
					System.out.println("Introduce numero 2 distinto de 0");
					op2 = entrada.nextDouble();
				} while (op2 == 0);
				entrada.nextLine();
				rsdo = division(op1, op2);
				System.out.println(rsdo);
				break;
			case 'A': //salir
			case 'a':
				System.out.println("Vuelve pronto");

			default: //opción no válida
				System.out.println("Opción no válida");

			}

		} while ((opcion != 'A') && (opcion != 'a'));

	}

	public static double suma(double op1, double op2) {
		double resultado = op1 + op2;
		return resultado;

	}

	public static double resta(double op1, double op2) {
		double resultado = op1 - op2;
		return resultado;

	}

	public static double multiplicacion(double op1, double op2) {
		double resultado = op1 * op2;
		return resultado;
	}

	public static double division(double op1, double op2) {
		double resultado = op1 / op2;
		return resultado;
	}

	public static void mostrar_menu() {
		System.out.println("***** Calculadora de “Sara Liñan Vazquez” *****");
		System.out.println("S. Sumar");
		System.out.println("R. Restar");
		System.out.println("M. Multiplicar");
		System.out.println("D. Dividir");
		System.out.println("A.Salir");
		System.out.println("*****************");
		System.out.println("Introduce opcion:");
	}

}
