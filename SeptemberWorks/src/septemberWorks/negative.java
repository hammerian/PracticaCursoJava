package septemberWorks;

import java.util.Scanner;

public class negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int cnt = 1;
		int a, b, c;
		
		while (cnt < 4) {
			System.out.println("\nIntroduce la primera cifra:");
			a = scn.nextInt();

			System.out.println("Introduce la segunda cifra:");
			b = scn.nextInt();

			System.out.println("Introduce la tercera cifra:");
			c = scn.nextInt();
			
			calculateMedia(buildArray(a,b,c));
			
			cnt++;
		}
		

	}
	
	public static void calculateMedia (int[] newArray) {

		int mediaPos = 0;
		int cantPos = 0;
		int mediaNeg = 0;
		int cantNeg = 0;
		
		if (newArray[0] >= 0) {				
			mediaPos = mediaPos + newArray[0];
			cantPos++;
		} else {
			mediaNeg = mediaNeg + newArray[0];
			cantNeg++;
		}
		if (newArray[1] >= 0) {				
			mediaPos = mediaPos + newArray[1];
			cantPos++;
		} else {
			mediaNeg = mediaNeg + newArray[1];
			cantNeg++;
		}
		if (newArray[2] >= 0) {				
			mediaPos = mediaPos + newArray[2];
			cantPos++;
		} else {
			mediaNeg = mediaNeg + newArray[2];
			cantNeg++;
		}
		
		if (cantPos > 0) {
			mediaPos = mediaPos / cantPos;
		}
		if (cantNeg > 0) {
			mediaNeg = mediaNeg / cantNeg;
		}
		
		System.out.println("La media de datos positivos es: "+mediaPos);
		System.out.println("La media de datos negativos es: "+mediaNeg);
	}

	public static int[] buildArray (int x, int y, int z) {
		int [] bArray = {x, y, z};
		return bArray;
	}
	
}
