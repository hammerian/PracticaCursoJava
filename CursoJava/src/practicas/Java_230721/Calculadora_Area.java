package practicas.Java_230721;

import java.util.Scanner;

public class Calculadora_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo:");
		double radio = scn.nextDouble();
		double pi = 3.14159;
		double area = (radio*radio)*pi;
		System.out.println("El area del círculo es: " + area);
		
	}

}
