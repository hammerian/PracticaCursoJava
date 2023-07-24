package practicas.Java_230721;

import java.util.Scanner;

public class Conversor_medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce la distancia en metros:");
		double metros = scn.nextDouble();
		
		double centimetros = metros * 100; // Valor de centímetros (1m = 100cm)
		double pies = metros * 3.28084; // Valor de pies (1m = 3,28084ft)
		
		System.out.println("El valor de " + metros + "m es " + centimetros + "cm o " + pies + "ft");
		
	}

}
