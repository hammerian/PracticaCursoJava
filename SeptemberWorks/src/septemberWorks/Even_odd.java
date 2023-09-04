package septemberWorks;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce cantidad de números:");
		int cant = scn.nextInt();
		int sum = 0;
		int[] even = new int[cant];
		int evenCant = 0;
		int[] odd = new int[cant];
		int oddCant = 0;
		while (sum<=cant) {
			if (sum %2 == 0) {
				even[evenCant] = sum;
				evenCant ++;
			} else {
				odd[oddCant] = sum;
				oddCant ++;
			}
			sum++;
		}
		
		String evenStr = "0, ";
		for (int i: even) {
			if (i > 0) {
				evenStr = evenStr + " " + i + ", ";
			}
		}
		System.out.println("Los "+evenCant+" números pares son:\n" + evenStr);
		String oddStr = "";
		for (int i: odd) {
			if (i > 0) {
				oddStr = oddStr + " " + i + ", ";
			}
		}
		System.out.println("Los "+oddCant+" números impares son:\n" + oddStr);
	}

}
