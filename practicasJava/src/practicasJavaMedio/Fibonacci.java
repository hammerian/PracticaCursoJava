package practicasJavaMedio;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número mayor de 1:");
		int num = scn.nextInt();
		if (num >1) {
			int res = 1;
			int prev = 0;
			String txt = "0 1 ";
			while (res < num) {
				res = res + prev;
				prev = res - prev;
				if (res < num) {
					txt = txt + res + " ";
				}
			}
			System.out.println(txt);
		} else {
			System.out.println("El número tiene que ser mayor de 1 :(");
		}
	}

}
