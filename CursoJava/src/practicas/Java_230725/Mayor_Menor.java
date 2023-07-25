package practicas.Java_230725;

import java.util.Scanner;

public class Mayor_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		double numero1 = scn.nextDouble();
		
		System.out.println("Introduce el segundo número:");
		double numero2 = scn.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("el número mayor es: " + numero1);
			System.out.println("La suma de los números es: " + (numero1 + numero2) + "\nLa resta de los números es: " + (numero1 - numero2));
		} else {
			System.out.println("el número mayor es: " + numero2);
			System.out.println("el producto de los números es: " + (numero1 * numero2) + "\nLa división de los números es: " + (numero1 / numero2));
		}
	}

}
