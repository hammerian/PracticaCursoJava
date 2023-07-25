package practicas.Java_230725;

import java.util.Scanner;

public class TestCapacitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Introduce el número de respuestas total:");
		double nota1 = scn.nextDouble();

		System.out.println("Introduce el número de respuestas acertadas:");
		double nota2 = scn.nextDouble();

		double porcentaje = (nota2 / nota1) * 100;

		if (porcentaje >= 90) {
			System.out.println("El porcentaje de respuestas acertadas es de: " + porcentaje + "%\nEl nivel es máximo.");
		} else if (porcentaje >= 75) {
			System.out.println("El porcentaje de respuestas acertadas es de: " + porcentaje + "%\nEl nivel es medio.");
		} else if (porcentaje >= 50) {
			System.out.println("El porcentaje de respuestas acertadas es de: " + porcentaje + "%\nEl nivel es regular.");
		} else {
			System.out.println("El porcentaje de respuestas acertadas es de: " + porcentaje + "%\nEstá fuera del nivel.");
		}
	}

}
