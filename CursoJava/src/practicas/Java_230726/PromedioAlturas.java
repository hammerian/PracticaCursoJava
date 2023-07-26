package practicas.Java_230726;

import java.util.Scanner;

public class PromedioAlturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce la cantidad de alturas a medir:");
		int cantidad = scn.nextInt();
		int conta = 1;
		double promedio = 0;
		while (conta <= cantidad) {
			System.out.println("Introduce la altura a promediar:");
			double altura = scn.nextDouble();
			promedio = promedio + altura;
			conta++;
		}
		promedio = promedio / cantidad;
		System.out.println("El promedio de las " + cantidad + " alturas es: " + promedio);
	}

}
