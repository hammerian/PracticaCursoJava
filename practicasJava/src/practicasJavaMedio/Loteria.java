package practicasMedio280723;

import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String txt = "";
		int conta = 1;
		while (conta<=5) {
			System.out.println("Introduce un número entre 0 y 9:");
			int num = scn.nextInt();
			if (num >= 0 && num < 9) {
				txt = txt + num;
				conta++;
			} else {
				System.out.println("El número no está entre 0 y 9 :(\n");
			}
		}
		System.out.println("El número de Lotería es: " + txt);
	}

}
