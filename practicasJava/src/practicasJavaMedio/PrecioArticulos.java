package practicasMedio280723;

import java.util.Scanner;

public class PrecioArticulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean myLoop = true;
		String listaNombres = "a,";
		String listaNumeros = "0,";
		Scanner scn = new Scanner(System.in);
		while (myLoop) {
			System.out.println("Introduce un nombre de artículo:");
			String nombre = scn.nextLine();
			listaNombres = listaNombres + nombre + ",";
			
			System.out.println("Introduce un precio para el artículo:");
			String precio = scn.nextLine();
			listaNumeros = listaNumeros + precio + ",";

			System.out.println("¿Seguir introduciendo objetos (S/N)?");
			String continuar = scn.nextLine();
			
			if (continuar.equals("N") | continuar.equals("n")) {
				myLoop = false;
			} else if (!continuar.equals("S") | !continuar.equals("s")) {
				System.out.println("La respuesta es (S/N), lo tomo como un Sí.");
			}
		}
		String [] resNombres = listaNombres.split(",");
		String [] resNumeros = listaNumeros.split(",");
		double grande = 0;
		String grandeT = "";
		double sumaTotal = 0;
		for (int i=0;i<resNombres.length;i++) {
			double dobComp = Double.parseDouble(resNumeros[i]);
			sumaTotal = sumaTotal + dobComp;
			if (dobComp > grande) {
				grandeT = resNombres[i];
				grande = dobComp;
			}
		}
		System.out.println("El total es "+sumaTotal+"\nEl artículo más caro es "+grandeT);
	}

}
