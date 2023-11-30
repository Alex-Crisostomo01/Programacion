package unidad4;

public class muestraNumRecursivo {

	public static void main(String[] args) {
		int cont = 1; 
		int num = muestraNum(cont);
		System.out.println(num);
	}
public static int muestraNum( int num) {
	if (num ==100) {
		return 100;	
	}
	System.out.println(num);
	return (muestraNum(num+1));
		
	
}

}
