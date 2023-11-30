package Unidad3;
import java.util.Scanner;
public class menu_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 4;
		
		//habilitamos lectura por teclado
		Scanner entrada=new Scanner(System.in);
		// definimos array 
		int [] nums = new int[TAM];
		int min=0;
		int max=0;
		char opcion;
		for (int i =0; i <TAM ;i++) {
			System.out.println("Introduce un  numero");
			nums[i]=entrada.nextInt();
		}
		
		entrada.nextLine();
		do {
			
			System.out.println("A. El valor maximos y minimo");
			System.out.println("B. Eliminar duplicados");
			System.out.println("C Rotar array\n"+ "D.Salir ");
			opcion = entrada.nextLine().charAt(0);
			//valor maximo y minimo 
			if (opcion== 'a')
				min = nums[0];
				max = nums [0];
				for (int i = 1 ; i < TAM; i++) {
					if (nums[i]> max) {
						max = nums [i];
						
					}
					if (nums[i]< min) {
						min = nums [i];
				
		}
				}
				System.out.println("max :" + max + "min: " + min);
		}
				while(opcion != 'a');
			
			}
		}
