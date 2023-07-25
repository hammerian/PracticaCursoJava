package practicas.Java_230725;

import java.util.Scanner;

public class digitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número:");
		int numero = scn.nextInt();
		
		if (numero < 10) {
			System.out.println("El número tiene un dígito.");
		} else if (numero < 100){
			System.out.println("El número tiene dos dígitos.");
		} else if (numero < 1000){
			System.out.println("El número tiene tres dígitos.");
		} else {
			System.out.println("El número tiene más de tres dígitos.");
		}
	}

}
