package practicas.Java_230726;

import java.util.Scanner;

public class GastoSueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce la cantidad de sueldos a contar:");
		int cantidad = scn.nextInt();
		int contaRicos = 0;
		int contaPobres = 0;
		int conta = 1;
		double sueldos = 0;
		
		while (conta <= cantidad) {
			System.out.println("Introduce el sueldo del empleado " + conta + ":");
			double sueldo = scn.nextDouble();
			sueldos = sueldos + sueldo;
			if (sueldo>300) {
				contaRicos ++;
			} else {
				contaPobres ++;
			}
			conta++;
		}
		
		System.out.println("El sueldo de " + cantidad + " empleados suma " + sueldos +
				"\nCon " + contaPobres + " empleados pobres y " + contaRicos + " empleados ricos.");
	}

}
