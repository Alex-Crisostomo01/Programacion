package unidad5;

import java.util.Scanner;

public class CCEJ3 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 int acum = 0;
		 System.out.println("introduce  una cadena de caracteres ");
		 String cad = entrada.nextLine();
		 System.out.println("introduce caracter a buscar");
		 char car = entrada.nextLine().charAt(0);
		 for (int i = 0 ; i<cad.length(); i++) {
			 char letra = cad.charAt(i);
			
			 if (car == letra ) {
				 acum++;
			 }
		
	}
		 System.out.println("el caracter ha salido " + acum+ " veces");
		 

}
}
