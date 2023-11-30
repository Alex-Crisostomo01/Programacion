package Unidad3;
import java.util.Scanner;
public class tresRayabidimensional {


static Scanner scanner = new Scanner(System.in); // variable global para leer por pantalla
static char[] tablero = new char[9]; // array de las posiciones del tablero
static char[][] tableroBidimensional = new char[9][9];
public static void main(String[] args) {
	int opcion;
	int resultJ1 = 0;
	int resultJ2 = 0;
	int empate= 0;
	int cont = 1;

	do { // do while que muestra las opciones
		menu();
		opcion = scanner.nextInt();
		iniciar();
		switch (opcion) {
		
		case 1:
			int mov;
			int pos;
			System.out.println("1. Jugar partida ");
			iniciar();
			inicioBidimensional();
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
				guardar(cont);
				cont++;
				if ((ganaJugador1() != true)&& (quedanCasillas()== true)) {
					System.out.println("pon una ficha J2");
					pos = scanner.nextInt();
					mueveJugador2(pos);}
					guardar(cont);
					cont++;

			} while ((quedanCasillas() == true) && (ganaJugador1()!=true) && (ganaJugador2()!= true));
			dibujarTablero();
			if ((ganaJugador1()== true)){
				System.out.println("gana jugador 1");
				resultJ1 ++;
			}
			if ((ganaJugador2()== true)) {
				System.out.println("gana jugador 2");
				resultJ2 ++;
			}
			if ((ganaJugador1()== false )&& (ganaJugador2() == false)) {
				
				empate++;
			}

			break;
		case 2:
			System.out.println("el jugador 1 ha ganado : " + resultJ1 + "veces");
			System.out.println("el jugador 1 ha ganado : " + resultJ2 +"veces");
			System.out.println("el jugador 1 y 2 ha ganado : " + empate + "veces");
			break;
		case 3:
			System.out.println("Recreando la partida");
			dibujarTableroBidimensional(cont); 
			
		
			
		break;
			
		case 4:
			System.out.println("chao chao chao chao");
			break;
		default:
			System.out.println("opcion no encontrada ");

		}
	} while (opcion != 4);

}

//Funcion que muestra el menu
public static void menu() {
	System.out.println("1.Jugar partida ");
	System.out.println("2.Mostrar estadistica");
	System.out.println("3.Recrear partida");
	System.out.println("4.Salir");
	System.out.println("Introduce una opcion");
}

//funcion que dibuja el tablero 
public static void dibujarTablero() {
	System.out.println("--------------");
	System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ");
	System.out.println("--------------");
	System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ");
	System.out.println("--------------");
	System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ");
	System.out.println("--------------");
	

}

//funcion que pone a 0 todo el tablero 
public static void iniciar() {
	for (int i = 0; i < 9; i++) {
		tablero[i] = ' ';
	}
}

//funcion que define la posicion en la que coloca el jugador 1 
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

public static void dibujarTableroBidimensional(int cont) {
	dibujarTablero();
	for (int i = 0; i <cont-1;i++) {
		System.out.println("--------------");
		System.out.println("| " + tableroBidimensional[i][0] + " | " + tableroBidimensional[i][1] + " | " + tableroBidimensional[i][2] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tableroBidimensional[i][3] + " | " + tableroBidimensional[i][4] + " | " + tableroBidimensional[i][5] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tableroBidimensional[i][6] + " | " + tableroBidimensional[i][7] + " | " + tableroBidimensional [i][8] + " | ");
		System.out.println("--------------");
	}
}
public static void inicioBidimensional() {
	for (int i = 0;i <9 ;i++ ) {
		for (int j = 0 ;j<9; j++)
		tableroBidimensional[i][j] = ' ' ;
	}
}
public static void guardar(int cont) {
	for(int i = cont-1 ;i<cont;i++) {
		for (int j = 0; j<9;j++) {
			tableroBidimensional[i][j] = tablero[j];
		}
	}
}
}





