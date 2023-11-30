package Unidad3;

import java.util.Scanner;

public class ejercicio23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[5];
		rellenaArray(nums);

	}
public static void rellenaArray (int [] nums2) {
	for (int i = 0 ; i < nums2.length; i++) {
		System.out.println("Intoduce un valor");
		nums2[i] = entrada.nextInt();
		
	return;
	}
}
}
