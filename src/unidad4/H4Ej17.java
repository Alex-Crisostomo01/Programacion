package unidad4;

public class H4Ej17 {

	public static void main(String[] args) {
		int[][] nums = new int[10][11];
		rellenaMatriz(nums);
		for (int i = 0; i < 10; i++) {
			sumaArray(nums[i]);
		}
		muestraMatriz(nums);

	}

	public static void rellenaMatriz(int[][] nums) {
		int num = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				nums[j][i] = num;
				num++;
			}
		}
	}

	public static void sumaArray(int[] vector) {
		int suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + vector[i];
		}
		vector[10] = suma;
	}

	public static void muestraMatriz(int[][] nums) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(nums[j][i] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i][10] + " ");
		}
	}

}
