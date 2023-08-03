package practicasJavaMedio;

import java.util.Scanner;

public class PosicionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] listado = {2,4,2,6,8,4,2,8,1,6};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce una posición del listado:");
		int pos = scn.nextInt();
		int num = listado[pos-1];

		System.out.println("El número en la posición: " + pos + " Es: " + num);

		int conta = 0;
		for (int i : listado) {
			if (i == num) {
				conta++;
			}
		}
		System.out.println("El número se repite " + conta + " veces.");
		
	}

}
