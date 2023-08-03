package practicasJavaMedio;

import java.util.Scanner;

public class ArrayPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] listado = {0,0,0,0,0,0};
		Scanner scn = new Scanner(System.in);

		int pos = 0;
		int neg = 0;
		String cadena = "";
		for (int i = 0;i <6 ;i++) {
			System.out.println("\nIntroduce un número positivo o negativo para añadirlo:");
			int num = scn.nextInt();
			listado [i] = num;
			if (num >=0) {
				pos = pos + num;
			} else {
				neg = neg + num;
			}
			cadena = cadena + num + ",";
		}
		cadena = cadena.substring(0, cadena.length() - 1);
		System.out.println("\nEl listado está compuesto por los números: "+ cadena +
				"\nCon el valor de números positivos: " + pos +
				"\nCon el valor de números negativos: " + neg);
		

	}

}
