package practicas.Java_230726;

import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean serie = true;
		int cantidad = 0;
		while (serie == true) {
			System.out.println("\nIntroduce un número:");
			int numero = scn.nextInt();
			if (numero == 9999) {
				serie = false;		
				System.out.println("Terminando...");
			} else {
				cantidad = cantidad + numero;
				System.out.println("El valor acumulado es: " + cantidad);
				if (cantidad < 0) {
					System.out.println("Y es menor a cero.");
				} else if (cantidad > 0) {
					System.out.println("Y es mayor a cero.");
				}
			}
		}
	}

}
