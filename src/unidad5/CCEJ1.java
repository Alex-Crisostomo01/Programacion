package unidad5;

import java.util.Scanner;

public class CCEJ1 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("introduce  una cadena de caracteres ");
		 String cad = entrada.nextLine();
		 System.out.println(cad);
		 for (int i = 0 ; i<cad.length(); i++) {
			 char letra = cad.charAt(i);
			 System.out.println(letra);
		 }
	}
}
