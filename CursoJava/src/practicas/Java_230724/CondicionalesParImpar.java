package Practica240723;

import java.util.Scanner;

public class CondicionalesParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero = scn.nextInt();
		if (numero % 2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
	}

}
