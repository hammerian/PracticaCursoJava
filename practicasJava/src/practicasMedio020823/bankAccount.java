package practicasMedio020823;

import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce número de cuenta:");
		String accNum = scn.nextLine();
		
		System.out.println("Introduce el dinero inicial:");
		double cant = scn.nextDouble();
		
		Account acn = new Account(accNum, cant);
		boolean exit = false;
		while (exit == false) {
			System.out.println("\nSelecciona una operación para la cuenta: " + acn.getAccountNumber() + "\n1. Mostrar saldo.\n2. Agregar saldo.\n3. Retirar saldo.\n4. Salir.");

			int opt = scn.nextInt();
			if (opt > 0 && opt < 5) {
				if (opt == 1) {
					System.out.println("\nEl saldo actual es: " + acn.getBalance() );
				} else if (opt == 2) {
					System.out.println("\nIntroduce el saldo a agregar: ");
					double cantAdd = scn.nextDouble();
					acn.addMoney(cantAdd);
				} else if (opt == 3) {
					System.out.println("\nIntroduce el saldo a retirar: ");
					double cantWdr = scn.nextDouble();
					acn.withdrawMoney (cantWdr);
				} else if (opt == 4) {
					exit = true;
				}
			}
		}
	}
}
