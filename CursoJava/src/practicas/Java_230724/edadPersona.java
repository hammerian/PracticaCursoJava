package practicas.Java_230724;

import java.util.Scanner;

public class edadPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int edad = 1;
		while (edad>0) {
			System.out.println("Introduce la edad de la persona:");
			edad = scn.nextInt();

			if (edad > 17) {
				System.out.println("La persona es mayor de edad");
				if (edad > 74) {
					System.out.println("La persona es anciana");
				} else {
					System.out.println("La persona es adulta");
				}
			} else {
				System.out.println("La persona es menor de edad");
				if (edad > 11) {
					System.out.println("La persona es adolescente");
				} else {
					System.out.println("La persona es infantil");
				}
			}
		}
	}

}
