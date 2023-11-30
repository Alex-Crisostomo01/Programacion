package unidad5;
import java.util.Random;
public class ejemploClaseRamdom {
// simular la tirada de un dado entre 1 - 6 
	public static void main(String[] args) {
		// 1er Paso Definir y construir el objeto 
		//defino un objeto 
		Random ale = null;
		// construimos el objeto  : reservamos ram
		// nombre del objeto = new nombre de constructor(parametro)
		ale = new Random();
		// Paso 2 : usarlo a traves de sus metodos 
		// nombre_objeto .metodo(parametros)
		int tirada = ale.nextInt(6)+1;
		System.out.println(tirada);

	}

}
