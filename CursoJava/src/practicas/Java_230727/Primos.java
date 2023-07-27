package practicas.Java_230727;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número tope:");
		int nTope = scn.nextInt();
		
		for (int i= 2; i<nTope; i++) {
			boolean prNum = true; 
			for (int j= 2; j<nTope; j++) {
				if ((i != j) && (i % j == 0)) {
					prNum = false;
				}
			}
			if (prNum) {
				System.out.println("El número: " + i + " es primo");
			}
		}
	}

}
