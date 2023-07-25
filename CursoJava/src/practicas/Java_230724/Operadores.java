package practicas.Java_230724;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 267 * 65;		
		System.out.println("* La multiplicación de 265 con 65 son " + resultado);
		
		int cociente = 267 / 65;
		int resto = 267%65;		
		System.out.println("\n* La división de 267 con 65, tiene un cociente de " + cociente + " y un resto de " + resto);

		int numero = 3;
		System.out.println("\n* La adicción de un número al valor " + numero);
		int adiccion = numero + 1;
		int sumatorio = numero+= 1;
		int incremento = 3;
		incremento++;		
		System.out.println("\n-Nos devuelve un valor por el primer método (x+1)= " + adiccion + "\n-Nos devuelve un valor por el segundo método (x+=1)= " + sumatorio + "\n-Nos devuelve un valor por el tercer método (x++)= " + incremento);
		
		int comando1 = 19;
		int comando2 = 8;
		int comando3 = 90;
		int comando4 = 62;
		boolean resultadoProducto = (comando1 * comando2) == (comando3 * comando4);		
		System.out.println("\n* El resultado la operación (" + comando1 + "x" + comando2 + ")\n  y el resultado de la operación (" + comando3 + "x" + comando4 + ")\n  es " + resultadoProducto);
				
		int valor = 1459;
		int operador1 = 3;
		int operador2 = 7;		
		boolean resultadoFinal = (valor % operador1 == 0) && (valor % operador2 == 0);		
		System.out.println("\n* El valor " + valor + " es divible por " + operador1 + " y divisible por " + operador2 + " es " + resultadoFinal);
		
	}

}
