package unidad5;

import java.util.Random;

public class HNAEj1 {

	public static void main(String[] args) {
		Random ale = new Random();
		
		for (int i = 0 ; i<20; i++) {
			int num = ale.nextInt(11);
			System.out.print(num + " ");
		}

	}

}
