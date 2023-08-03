package practicasMedio310723;

import java.util.Scanner;

public class Calculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo:");
		int nTope = scn.nextInt();
		Circle cr = new Circle(nTope);
		System.out.println("El area del círculo es: "+cr.getArea());
		System.out.println("La longitud del círculo es: "+cr.getCirc());
		
	}

}
