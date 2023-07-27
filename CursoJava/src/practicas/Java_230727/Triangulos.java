package practicas.Java_230727;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número de triángulos:");
		int cantidad = scn.nextInt();
		int contaEqui = 0;
		int contaIso = 0;
		int contaEsca = 0;
		for (int i = 0; i<cantidad; i++) {
			System.out.println("\nIntroduce el tipo de triángulo:\n1.equiláteros\n2.isósceles\n3.escalenos");
			int triaTipo = scn.nextInt();
			if (triaTipo == 1) {
				contaEqui++;
			} else if (triaTipo == 2) {
				contaIso++;
			} else if (triaTipo == 3) {
				contaEsca++;
			} else {
				System.out.println("\nEl triángulo no es válido.");
			}			
		}
		System.out.println("\nHay " + contaEqui + " triángulos equiláteros."
		+ "\nHay " + contaIso + " triángulos isósceles."
		+ "\nHay " + contaEsca + " triángulos escalenos.");
		if ((contaEqui < contaIso) && (contaEqui < contaEsca)) {
			System.out.println("\nHay menos cantidad de triángulos equiláteros.");
		} else if ((contaIso < contaEqui) && (contaIso < contaEsca)) {
			System.out.println("\nHay menos cantidad de triángulos isósceles.");
		} else if ((contaEsca < contaEqui) && (contaEsca < contaIso)) {
			System.out.println("\nHay menos cantidad de triángulos escalenos.");
		} else {
			System.out.println("\nHay cantidades repetidas.");
		}
	}

}
