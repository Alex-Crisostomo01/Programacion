package Unidad3;

import java.util.Scanner;

public class tresRaya_examen {
	static Scanner scanner = new Scanner(System.in); // variable global para leer por pantalla
	static char[] tablero = new char[9]; // array de las posiciones del tablero

	public static void main(String[] args) {
		int opcion;
		int resultJ1 = 0;
		int resultJ2 = 0;
		int empate= 0;

		do { // do while que muestra las opciones
			menu();
			opcion = scanner.nextInt();
			switch (opcion) {

			case 1:
				int pos;
				System.out.println("1. Jugar partida ");
				iniciar();
				dibujarTablero();
				System.out.println("jugador 1 : X");
				System.out.println("jugador 2 : O");
				// tiene que preguntar los movimiento de los jugadiores hasta que todas las
				// casillas esten completas
				do {
					dibujarTablero();
					System.out.println("pon una ficha J1");
					pos = scanner.nextInt();
					mueveJugador1(pos);
					dibujarTablero();
					if ((ganaJugador1() != true)&& (quedanCasillas()== true)) {
						System.out.println("pon una ficha J2");
						pos = scanner.nextInt();
						mueveJugador2(pos);}
					if (esEmpate()== true) {
						System.out.println("Han quedado empate");
					}
					

				} while ((quedanCasillas() == true) && (ganaJugador1()!=true) && (ganaJugador2()!= true));
				dibujarTablero();
				muestraResultado();
				if ((ganaJugador1()== true)){
					
					resultJ1 ++;
				}
				if ((ganaJugador2()== true)) {
		
					resultJ2 ++;
				}
				if ((ganaJugador1()== false )&& (ganaJugador2() == false)) {
					
					empate++;
				}

				break;
			case 2:
				System.out.println("el jugador 1 ha ganado : " + resultJ1 + " veces");
				System.out.println("el jugador 1 ha ganado : " + resultJ2 +" veces");
				System.out.println("el jugador 1 y 2 ha empatado : " + empate + " veces");
				break;
			case 3:
				System.out.println("chao chao chao chao");
				break;
			default:
				System.out.println("opcion no encontrada ");

			}
		} while (opcion != 3);

	}

// Funcion que muestra el menu
	public static void menu() {
		System.out.println("1.Jugar partida ");
		System.out.println("2.Mostrar estadistica");
		System.out.println("3.Salir");
		System.out.println("Introduce una opcion");
	}

// funcion que dibuja el tablero 
	public static void dibujarTablero() {
		System.out.println("--------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ");
		System.out.println("--------------");

	}

// funcion que pone a 0 todo el tablero 
	public static void iniciar() {
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
	}

// funcion que define la posicion en la que coloca el jugador 1 
	public static void mueveJugador1(int pos) {
		boolean valido = movimientoValido(pos);
		if (valido == true) {
			tablero[pos - 1] = 'X';
		}
		while (valido == false) {
			System.out.println("Es incorrecto. Ponlo de nuevo ");
			pos = scanner.nextInt();
			valido = movimientoValido(pos);
			if (valido == true) {
				tablero[pos - 1] = 'X';
			}

		}
	}

	public static void mueveJugador2(int pos) {
		boolean valido = movimientoValido(pos);
		if (movimientoValido(pos) == true) {
			tablero[pos - 1] = 'O';}
		while (valido == false) {
				System.out.println("Es incorrecto. Ponlo de nuevo ");
				pos = scanner.nextInt();
				valido = movimientoValido(pos);
				if (valido == true) {
					tablero[pos - 1] = 'O';
				}

			}
		}
	

	public static boolean movimientoValido(int pos) {
		if (pos < 1 || pos > 9) {
			return false;
		}
		if ((tablero[pos - 1] == 'X') || (tablero[pos - 1] == 'O'))
			return false;

		else {
			return true;
		}

	}

	public static boolean ganaJugador1() {
		if ((tablero[0] == 'X') && (tablero[1] == 'X') && (tablero[2] == 'X')
				|| (tablero[3] == 'X') && (tablero[4] == 'X') && (tablero[5] == 'X')
				|| (tablero[6] == 'X') && (tablero[7] == 'X') && (tablero[8] == 'X')
				|| (tablero[0] == 'X') && (tablero[3] == 'X') && (tablero[6] == 'X')
				|| (tablero[1] == 'X') && (tablero[4] == 'X') && (tablero[7] == 'X')
				|| (tablero[2] == 'X') && (tablero[5] == 'X') && (tablero[8] == 'X')
				|| (tablero[0] == 'X') && (tablero[4] == 'X') && (tablero[8] == 'X')
				|| (tablero[2] == 'X') && (tablero[4] == 'X') && (tablero[6] == 'X')) {
			return true;
		}
		return false;
	}

	public static boolean ganaJugador2() {
		if ((tablero[0] == 'O') && (tablero[1] == 'O') && (tablero[2] == 'O')
				|| (tablero[3] == 'O') && (tablero[4] == 'O') && (tablero[5] == 'O')
				|| (tablero[6] == 'O') && (tablero[7] == 'O') && (tablero[8] == 'O')
				|| (tablero[0] == 'O') && (tablero[3] == 'O') && (tablero[6] == 'O')
				|| (tablero[1] == 'O') && (tablero[4] == 'O') && (tablero[7] == 'O')
				|| (tablero[2] == 'O') && (tablero[5] == 'O') && (tablero[8] == 'O')
				|| (tablero[0] == 'O') && (tablero[4] == 'O') && (tablero[8] == 'O')
				|| (tablero[2] == 'O') && (tablero[4] == 'O') && (tablero[6] == 'O')) {
			return true;
		}
		return false;
	}

	public static boolean quedanCasillas() {
		
		for (int i = 0; i < 9; i++) {
			if (tablero[i] == ' ') {
				return true;
			}
		}
		return false;
	}
	public static boolean esEmpate() {
	boolean ganaJ1 = ganaJugador1();
	boolean ganaJ2 = ganaJugador2();
	boolean casillas= quedanCasillas();
	if ((casillas == false) && (ganaJ1 == false)&& (ganaJ2 == false)) {
		return true;
	}
	return false;
	
	}
	public static void muestraResultado() {
		System.out.println("Partida terminada");
		if ((ganaJugador1()== true)){
			System.out.println("gana jugador 1");
			
		}
		if ((ganaJugador2()== true)) {
			System.out.println("gana jugador 2");
		
		}
		if ((ganaJugador1()== false )&& (ganaJugador2() == false)) {
			System.out.println("Ha habido un empate");
			
		}
	}
}
