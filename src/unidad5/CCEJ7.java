package unidad5;

import java.util.Scanner;

public class CCEJ7 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("introduce una cadena");
		 String cad = entrada.nextLine();
		System.out.println("intoduce el primer caracter");
		char car1=  entrada.nextLine().charAt(0);
		System.out.println("intoduce el segundo caracter");
		char car2=  entrada.nextLine().charAt(0);
		System.out.println(cad);
		String cad2 = cad.replace(car1, car2);
		System.out.println(cad2);
	}

}
