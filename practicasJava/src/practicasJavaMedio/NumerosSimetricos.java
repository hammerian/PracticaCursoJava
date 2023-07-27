package practicasJavaMedio;

import java.util.Scanner;

public class NumerosSimetricos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un número entre 5 y 20:");
		int num = scn.nextInt();
		if (num >=5 && num <=20) {
			String txt = "";
			for (int i = 1;i <= num; i++) {
				txt = txt + i;
			}
			for (int i = 1;i < num; i++) {
				txt = txt + (num-i);
			}
			System.out.println(txt);
		} else {
			System.out.println("El número no está entre 5 y 20 :(");
		}
		
	}

}
