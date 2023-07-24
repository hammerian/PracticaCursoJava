package Practica240723;

import java.util.Scanner;

public class numeroDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero = scn.nextInt();
		
		if (numero % 2==0) {
			System.out.println("El número es divisible por 2");
			if (numero % 3==0) {	
				System.out.println("El número es divisible por 3");
				if (numero % 5==0) {	
					System.out.println("El número es divisible por 5");
				}
			}
		} else if (numero % 3==0) {	
			System.out.println("El número es divisible por 3");
			if (numero % 5==0) {	
				System.out.println("El número es divisible por 5");
			}
		} else if (numero % 5==0) {	
			System.out.println("El número es divisible por 5");
		} else {
			System.out.println("El número no es ");
		}
	}

}
