package practicas.Java_230725;

import java.util.Scanner;

public class NotaPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota:");
		double nota1 = scn.nextDouble();

		System.out.println("Introduce la segunda nota:");
		double nota2 = scn.nextDouble();

		System.out.println("Introduce la tercera nota:");
		double nota3 = scn.nextDouble();

		double promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio > 7) {
			System.out.println("El promedio de notas es: " + promedio + ". Promocionado.");
		} else {
			System.out.println("El promedio de notas es: " + promedio + ". No promocionado.");
		}
	}

}
