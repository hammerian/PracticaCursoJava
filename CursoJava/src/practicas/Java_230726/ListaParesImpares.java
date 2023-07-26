package practicas.Java_230726;

import java.util.Scanner;

public class ListaParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números:");
		int cantidad = scn.nextInt();
		int conta = 1;
		int pares = 0;
		int impares = 0;
		while (conta <= cantidad) {
			System.out.println("Introduce un número:");
			int numero = scn.nextInt();
			if (numero % 2==0) {
				System.out.println("El número es par\n");
				pares++;
			} else {
				System.out.println("El número es impar\n");
				impares++;
			}
			conta++;
		}
		System.out.println("El número de pares es " + pares + ", y el número de impares es " + impares);
	}

}
