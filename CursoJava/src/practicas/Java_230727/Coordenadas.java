package practicas.Java_230727;

import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int contaPosi = 0;
		int contaNega = 0;
		int conta15 = 0;
		int contaPares = 0;
		for (int i = 1; i<=10; i++) {
			System.out.println("Introduce la coordenada x del número "+ i +":");
			int coorX = scn.nextInt();
			System.out.println("Introduce la coordenada y del número "+ i +":");
			int coorY = scn.nextInt();
			
			if(coorX >= 0 && coorY >= 0) {
				System.out.println("El punto está en el Cuadrante 1\n");
			} else if (coorX < 0 && coorY >= 0) {
				System.out.println("El punto está en el Cuadrante 2\n");
			} else if (coorX < 0 && coorY < 0) {
				System.out.println("El punto está en el Cuadrante 3\n");
			} else if (coorX >= 0 && coorY < 0) {
				System.out.println("El punto está en el Cuadrante 4\n");
			}
			
			if(coorX > 0) {
				contaPosi++;
			} else {
				contaNega++;
			}
			if(coorY > 0) {
				contaPosi++;
			} else {
				contaNega++;
			}
			if(coorX % 15 == 0) {
				conta15++;
			}
			if(coorY % 15 == 0) {
				conta15++;
			}
			if(coorX % 2 == 0) {
				contaPares++;
			}
			if(coorY % 2 == 0) {
				contaPares++;
			}
			
		}

		System.out.println("La cantidad de datos positivos: "+contaPosi);
		System.out.println("La cantidad de datos negativos: "+contaNega);
		System.out.println("La cantidad de datos múltiplos de 15: "+conta15);
		System.out.println("La cantidad de datos pares: "+contaPares);
	}

}
