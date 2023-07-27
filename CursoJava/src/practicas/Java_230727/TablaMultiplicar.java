package practicas.Java_230727;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número a mostrar su tabla:");
		int numTabla = scn.nextInt();

		for (int i = 1; i<13; i++) {			
			System.out.println(numTabla + " x " + i + " : " + numTabla*i);			
		}
	}

}
