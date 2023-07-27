package practicas.Java_230727;

import java.util.Scanner;

public class ParesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número de pares:");
		int cantidad = scn.nextInt();
		int conta = 0;
		
		for (int i = 0; i<cantidad; i++) {
			System.out.println("\nIntroduce la altura del triangulo:");
			double altura = scn.nextInt();
			System.out.println("\nIntroduce la base del triangulo:");
			double base = scn.nextInt();
			double area = (base*altura)/2;
			if (area >12) {
				conta++;
			}
			System.out.println("\nEl triángulo tiene una altura de: "+altura+" y una base de: "+base+", con un área de: "+area);
		}
		
		System.out.println("\nEl número total de triángulos con área mayor de 12 es: "+ conta);
	}

}
