package practicas.Java_230721;

import java.util.Scanner;

public class Conversor_monedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce el valor en Dolar USA:");
		double dolares = scn.nextDouble();
		double cambio = 0.89885; // Cambio a día 23 de Julio de 2023 (1$ = 0.89885€)
		
		double euros = dolares * cambio;
		
		System.out.println("El valor de " + dolares + " Dolar USA: " + euros + " Euros");

	}

}
